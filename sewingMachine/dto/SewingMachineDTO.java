package com.xworkz.sewingMachine.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="sewing_details")


public class SewingMachineDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SEWING_ID")
	private int sewingId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "COLOUR")
	private String colour;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "TYPE")
	private String type;
	@Column(name = "ISWORKING")
	private boolean isWorking;
	
	
	public SewingMachineDTO(  String name, String colour, double price, String type, boolean isWorking) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.type = type;
		this.isWorking = isWorking;
	}


	public SewingMachineDTO() {
		super();
	}
	

}
