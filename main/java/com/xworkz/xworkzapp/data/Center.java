package com.xworkz.xworkzapp.data;

public class Center {
	
	private String name;
	private String location;
	private int noOfWorkers;
	private String vaccineName;
	public Center(String name, String location, int noOfWorkers, String vaccineName) {
		super();
		this.name = name;
		this.location = location;
		this.noOfWorkers = noOfWorkers;
		this.vaccineName = vaccineName;
	}
	@Override
	public String toString() {
		return "Center [name=" + name + ", location=" + location + ", noOfWorkers=" + noOfWorkers + ", vaccineName="
				+ vaccineName + "]";
	}
	

}
