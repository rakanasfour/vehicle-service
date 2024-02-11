package com.vservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vservice.model.ServiceModel;

public interface ServiceRepository extends MongoRepository<ServiceModel, String>{

}
