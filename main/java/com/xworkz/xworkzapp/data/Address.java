package com.xworkz.xworkzapp.data;

public class Address {
	private String location;
	private String buildingNo;
	public Address(String location, String buildingNo) {
		super();
		this.location = location;
		this.buildingNo = buildingNo;
	}
	@Override
	public String toString() {
		return "Address [location=" + location + ", buildingNo=" + buildingNo + "]";
	}
	


}
