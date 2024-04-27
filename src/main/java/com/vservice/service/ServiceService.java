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
	
	
	public Iterable<ServiceModel> getAllServices(){
		
		
		return repo.findAll();
	}
	
	public List<ServiceModel> getType(String type){
		
		return repo.findByType(type);
	}
	
	public String addService(ServiceModel serviceModel) {
		repo.save(serviceModel);
		return "The service has been added"; 
	}
	
	public String updateService(ServiceModel service) {
		
		repo.save(service);
		
		return "the service has been updated";
	}
	
	public String removeService(int id) {
		repo.deleteById(id);
		
		return "the service has been deleted";
	}

	
	
}
