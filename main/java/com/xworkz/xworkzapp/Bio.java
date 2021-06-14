package com.xworkz.xworkzapp;

public class Bio {
	
	
	private String name;
	private String address;
	private int age;
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	



@Override
	public String toString() {
		return "Bio [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
public void name() {
	System.out.println("my name is:"+" "+ name);
}

public Bio() {
	System.out.println("default constructor");
}
public Bio(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}



}
