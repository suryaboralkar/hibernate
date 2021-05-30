package com.xworkz.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
@Entity
@Table(name = "pizza_details")
@NamedQuery(name = "getAllData", query = "from PizzaDTO ")
@NamedQuery(name = "getTotalPrice", query = "select sum(price) from PizzaDTO")
@NamedQuery(name = "getPriceByName", query = "select p.price from PizzaDTO As p where p.name=:pizzaName")
@NamedQuery(name = "getMaxPrice", query = "select max(price) from PizzaDTO")
@NamedQuery(name = "getMinPrice", query = "select min(price) from PizzaDTO")
@NamedQuery(name = "getAvgPrice", query = "select avg(price) from PizzaDTO")
@NamedQuery(name = "loadFirstResultAndMaxResult", query = "from PizzaDTO ")


public class PizzaDTO {

	@Column(name = "PIZZA_ID")
	@Id // this annotation is used for primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this annotaation is used for auto incriment
	private int pizzaID;
	@Column(name = "NAME")
	private String name;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "PRICE")
	private double price;

	@Column(name = " IS_AVAILABLE")
	private boolean isAvailable;

	@Column(name = "SIZE")
	private String size;
	@Column(name = "TYPE")
	private String type;
	
	
	public PizzaDTO() {
		super();
	}


	public PizzaDTO(String name, String location, double price, boolean isAvailable, String size, String type) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
		this.isAvailable = isAvailable;
		this.size = size;
		this.type = type;
	}
	
	
	
	
	
	
	
	
	
	
	
	}


