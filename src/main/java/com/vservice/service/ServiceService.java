package com.vservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vservice.Repository.ServiceRepository;
import com.vservice.model.ServiceModel;

@Service
public class ServiceService {

	@Autowired
	ServiceRepository repo;
	
	public List<ServiceModel> getAllServices(){
		
		
		return repo.findAll();
	}
	
	
	public String addService(ServiceModel serviceModel) {
				repo.save(serviceModel);
				return "The service has been added"; 
	}
}
