package com.xworkz.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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


