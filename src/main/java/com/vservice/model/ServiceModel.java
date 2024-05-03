package com.vservice.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Table(name="service")
@Entity
public class ServiceModel {
	@Id
	private int id;
	@Column(name="owner")
	private String owner;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="model")
	private String model;
	
	@Column(name="type")
	private ServiceEnum type;
	
	@Column(name="cost")
	private int cost;
	
	@Column(name="date")
	private Date date;

	public ServiceModel(int id, String owner, String brand, String model, ServiceEnum type, int cost, Date date) {
		super();
		this.id = id;
		this.owner = owner;
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.cost = cost;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public ServiceEnum getType() {
		return type;
	}

	public void setType(ServiceEnum type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDate() {
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    return formatter.format(date);
	}


	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ServiceModel [id=" + id + ", owner=" + owner + ", brand=" + brand + ", model=" + model + ", type="
				+ type + ", cost=" + cost + ", date=" + date + "]";
	}

	public ServiceModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
	
	

	
	
	
	

}
