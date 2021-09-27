package com.patterns.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patterns.demo.factory.Vehicle;
import com.patterns.demo.factory.VehicleFactoryImplementation;

@RestController
@RequestMapping("/pattern")
public class PatternsController {

	@GetMapping("/factory")
	public ResponseEntity<?> factory(@RequestParam(name="vehicle", defaultValue="Car")String vehicle) throws Exception{
		Vehicle vehicleFound = VehicleFactoryImplementation.createInstance(vehicle);
		return ResponseEntity.ok(vehicleFound.specification());
	}
}
