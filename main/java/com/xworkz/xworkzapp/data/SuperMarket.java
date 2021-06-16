package com.xworkz.xworkzapp.data;

public class SuperMarket {
	
	private String name;
	private Address address;
	private int noOfWorkers;
	private int noOfCounters;
	public SuperMarket(String name, Address address, int noOfWorkers, int noOfCounters) {
		super();
		this.name = name;
		this.address = address;
		this.noOfWorkers = noOfWorkers;
		this.noOfCounters = noOfCounters;
	}
	@Override
	public String toString() {
		return "SuperMarket [name=" + name + ", address=" + address + ", noOfWorkers=" + noOfWorkers + ", noOfCounters="
				+ noOfCounters + "]";
	}
	
	

}
