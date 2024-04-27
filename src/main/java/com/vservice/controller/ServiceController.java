package com.vservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vservice.model.ServiceModel;
import com.vservice.service.ServiceService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ServiceController {
	
	@Autowired
	ServiceService service;
	@GetMapping("getAllServices")
	public Iterable<ServiceModel> getAllServices(){
		
		return service.getAllServices();
	}
	
	@PostMapping("addService")
	public String addService(@RequestBody ServiceModel serviceModel) {
		
		return service.addService(serviceModel);
	}
	
	@GetMapping("/getType/{type}")
	public List<ServiceModel>  getType(@PathVariable ("type") String type) {
		return service.getType(type);
	}

	
	@PutMapping("/update/{id}")
	public String updateService (@PathVariable("id") int id,@RequestBody ServiceModel serviceM) {
		serviceM.setId(id);
		 return service.updateService(serviceM);		  
	}

	@DeleteMapping("/delete/{id}")
	public String removeService(@PathVariable("id") int id) {
		return service.removeService(id);
	}
	
	
	

}
