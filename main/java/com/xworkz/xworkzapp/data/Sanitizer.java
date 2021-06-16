package com.xworkz.xworkzapp.data;

public class Sanitizer {
	private String name;
	private int price;
	private String quantity;
	private Alcohol alcohol;
	public Sanitizer(String name, int price, String quantity, Alcohol alcohol) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.alcohol = alcohol;
	}
	@Override
	public String toString() {
		return "Sanitizer [name=" + name + ", price=" + price + ", quantity=" + quantity + ", alcohol=" + alcohol + "]";
	}
	
	
	

}
