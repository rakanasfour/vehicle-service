package com.vservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vservice.model.ServiceModel;
import com.vservice.service.ServiceService;

@RestController
@RequestMapping("/api")
public class ServiceController {
	
	@Autowired
	ServiceService service;
	@GetMapping("getAllServices")
	public List<ServiceModel> getAllServices(){
		
		return service.getAllServices();
	}
	
	@PostMapping("addService")
	public String addService(@RequestBody ServiceModel serviceModel) {
		
		return service.addService(serviceModel);
	}
	
	
	

}
