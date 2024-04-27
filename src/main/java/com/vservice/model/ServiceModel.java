package com.vservice.model;

import java.util.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//@Document(value="service")
//@DynamoDBTable(tableName = "vehicle-service")

@Table(name="service")
@Entity
public class ServiceModel {
	@Id
	private int id;
	@Column(name="date")
	private Date date;
	@Column(name="type")
	private String type;
	@Column(name="cost")
	private int cost;
	@Column(name="depreciation")
	private int depreciation;
	
  //  @DynamoDBHashKey(attributeName = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
  ///  @DynamoDBAttribute(attributeName = "Name")

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
  //  @DynamoDBAttribute(attributeName = "Type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
   // @DynamoDBAttribute(attributeName = "Cost")

	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
   // @DynamoDBAttribute(attributeName = "Depreciation")

	public int getDepreciation() {
		return depreciation;
	}
	public void setDepreciation(int depreciation) {
		this.depreciation = depreciation;
	}
	public ServiceModel(int id, Date date, String type, int cost, int depreciation) {
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
