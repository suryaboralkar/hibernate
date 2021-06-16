package com.xworkz.xworkzapp.data;

public class Alcohol {
	
	private String content;
	private String alcoholPercentage;
	public Alcohol(String content, String alcoholPercentage) {
		super();
		this.content = content;
		this.alcoholPercentage = alcoholPercentage;
	}
	@Override
	public String toString() {
		return "Alcohol [content=" + content + ", alcoholPercentage=" + alcoholPercentage + "]";
	}

}
