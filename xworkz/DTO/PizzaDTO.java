package com.xworkz.DTO;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.NonFinal;

@Getter
@Setter
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
	public PizzaDTO(@NonNull String name, @NonNull String location, @NonNull double price, @NonNull boolean isAvailable,
			@NonNull String size, @NonNull String type) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
		this.isAvailable = isAvailable;
		this.size = size;
		this.type = type;
	}

}
