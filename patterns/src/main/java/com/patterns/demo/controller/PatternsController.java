package com.patterns.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patterns.demo.patterns.abstractfactory.model.GenerateAbstractFactory;
import com.patterns.demo.patterns.adapter.Basement;
import com.patterns.demo.patterns.adapter.Garage;
import com.patterns.demo.patterns.adapter.model.BasementThing;
import com.patterns.demo.patterns.adapter.model.GarageTool;
import com.patterns.demo.patterns.adapter.model.ToolAdapterImpl;
import com.patterns.demo.patterns.bridge.BicycleBridge;
import com.patterns.demo.patterns.bridge.CarBridge;
import com.patterns.demo.patterns.bridge.Engine;
import com.patterns.demo.patterns.bridge.Pedals;
import com.patterns.demo.patterns.builder.model.GenerateBuilder;
import com.patterns.demo.patterns.composite.GenerateComposite;
import com.patterns.demo.patterns.decorator.service.GarageService;
import com.patterns.demo.patterns.facade.model.GenerateFacade;
import com.patterns.demo.patterns.factory.VehicleFactoryImplementation;
import com.patterns.demo.patterns.fluentbuilder.GenerateFluentBuilder;
import com.patterns.demo.patterns.iterator.GenerateIterator;
import com.patterns.demo.patterns.observer.GenerateObserver;
import com.patterns.demo.patterns.prototype.model.GeneratePrototype;
import com.patterns.demo.patterns.proxy.VehicleSound;
import com.patterns.demo.patterns.proxy.model.VehicleSoundImpl;
import com.patterns.demo.patterns.singleton.SingletonGenerator;
import com.patterns.demo.patterns.template.GenerateTemplate;
import com.patterns.demo.patterns.visitor.GenerateVisitor;

@RestController
@RequestMapping("/pattern")
public class PatternsController {

	@Autowired
	private GarageService garageService;
	
	@GetMapping("/factory")
	public ResponseEntity<?> factory(@RequestParam(name="vehicle", defaultValue="Car") String vehicle) throws Exception{
		return ResponseEntity.ok(VehicleFactoryImplementation.createInstance(vehicle).specification());
	}
	
	@GetMapping("/decorator")
	public ResponseEntity<?> decorator(){
		return ResponseEntity.ok(garageService.getGarage());
	}
	
	@GetMapping("/adapter")
	public ResponseEntity<?> adapter(@RequestParam(name="tool", defaultValue = "hammer") String vehicleToAdd){
        Garage tool = new GarageTool();
        Basement thing = new BasementThing();
        Garage thingAdapter = new ToolAdapterImpl(thing);
        
		return ResponseEntity.ok(new StringBuilder()
				.append(tool.addTool(vehicleToAdd))
				.append(" and ")
				.append(thingAdapter.addTool(vehicleToAdd)));
	}
	
	@GetMapping("/proxy")
	public ResponseEntity<?> proxy(){
		VehicleSound sound = new VehicleSoundImpl();
		return ResponseEntity.ok(new StringBuilder()
				.append(sound.makeSound())
				.append(" ")
				.append(sound.makeSound()));
	}
	
	@GetMapping("/bridge")
	public ResponseEntity<?> bridge(){
		return ResponseEntity.ok(new StringBuilder()
				.append(new BicycleBridge(new Pedals()).powerOn())
				.append(" ")
				.append(new CarBridge(new Engine()).powerOn())
				.append(" ")
				.append(new BicycleBridge(new Engine()).powerOn())
				.append(" ")
				.append(new CarBridge(new Pedals()).powerOn())
				.toString());
	}
	
	@GetMapping("/composite")
	public ResponseEntity<?> composite(){
		return ResponseEntity.ok(new GenerateComposite().createGarage());
	}
	
	@GetMapping("/prototype")
	public ResponseEntity<?> prototype(){
		return ResponseEntity.ok(new GeneratePrototype().generate());
	}
	
	@GetMapping("/abstract-factory")
	public ResponseEntity<?> abstractFactory(
			@RequestParam(name="building", defaultValue="stable") String building,
			@RequestParam(name="unit", defaultValue="1")int type){
		new GenerateAbstractFactory().generate(building, type);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/builder")
	public ResponseEntity<?> builderFactory(){
		return ResponseEntity.ok(new GenerateBuilder().generate());
	}
	
	@GetMapping("/singleton")
	public ResponseEntity<?> singleton(){
		return ResponseEntity.ok(new SingletonGenerator().generate());
	}
	
	@GetMapping("/fluent-builder")
	public ResponseEntity<?> fluentBuilder(){
		return ResponseEntity.ok(new GenerateFluentBuilder().generate());
	}
	
	@GetMapping("/facade")
	public ResponseEntity<?> facade(){
		return ResponseEntity.ok(new GenerateFacade().generate());
	}
	
	@GetMapping("/iterator")
	public ResponseEntity<?> iterator(){
		return ResponseEntity.ok(new GenerateIterator().generate());
	}
	
	@GetMapping("/observer")
	public ResponseEntity<?> observer(){
		new GenerateObserver().generate();
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/template")
	public ResponseEntity<?> template(){
		return ResponseEntity.ok(new GenerateTemplate().generate());
	}
	
	@GetMapping("/visitor")
	public ResponseEntity<?> visitor(){
		new GenerateVisitor().generate();
		return ResponseEntity.ok().build();
	}
}
