package com.patterns.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patterns.demo.adapter.Basement;
import com.patterns.demo.adapter.Garage;
import com.patterns.demo.adapter.model.BasementThing;
import com.patterns.demo.adapter.model.ToolAdapterImpl;
import com.patterns.demo.bridge.BicycleBridge;
import com.patterns.demo.bridge.CarBridge;
import com.patterns.demo.bridge.Engine;
import com.patterns.demo.bridge.Pedals;
import com.patterns.demo.composite.GenerateComposite;
import com.patterns.demo.adapter.model.GarageTool;
import com.patterns.demo.decorator.service.GarageService;
import com.patterns.demo.factory.Vehicle;
import com.patterns.demo.factory.VehicleFactoryImplementation;
import com.patterns.demo.prototype.model.GeneratePrototype;
import com.patterns.demo.proxy.VehicleSound;
import com.patterns.demo.proxy.model.VehicleSoundImpl;

@RestController
@RequestMapping("/pattern")
public class PatternsController {

	@Autowired
	private GarageService garageService;
	
	@GetMapping("/factory")
	public ResponseEntity<?> factory(@RequestParam(name="vehicle", defaultValue="Car") String vehicle) throws Exception{
		Vehicle vehicleFound = VehicleFactoryImplementation.createInstance(vehicle);
		return ResponseEntity.ok(vehicleFound.specification());
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
}
