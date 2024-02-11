package com.vservice.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value="service")
public class ServiceModel {
	@Id
	private int id;
	private Date date;
	private ServiceEnum type;
	private int cost;
	private int depreciation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public int getDepreciation() {
		return depreciation;
	}
	public void setDepreciation(int depreciation) {
		this.depreciation = depreciation;
	}
	public ServiceModel(int id, Date date, ServiceEnum type, int cost, int depreciation) {
		super();
		this.id = id;
		this.date = date;
		this.type = type;
		this.cost = cost;
		this.depreciation = depreciation;
	}
	
	
	public ServiceModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ServiceModel [id=" + id + ", date=" + date + ", type=" + type + ", cost=" + cost + ", depreciation="
				+ depreciation + "]";
	}
	
	
	
	
	
	

}
