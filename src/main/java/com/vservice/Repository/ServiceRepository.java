package com.vservice.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vservice.model.ServiceModel;


//@EnableScan

//public interface ServiceRepository extends CrudRepository <ServiceModel, Integer>{
public interface ServiceRepository extends JpaRepository <ServiceModel, Integer>{
	@Query(value="SELECT * FROM vehicle_service.service where type = ?1 ", nativeQuery=true)
	List<ServiceModel> findByType(String type);

	
}

