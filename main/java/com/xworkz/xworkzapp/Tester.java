package com.xworkz.xworkzapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		String spring = "spring.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(spring);
		Bio bio = context.getBean(Bio.class);
		System.out.println(bio);

	}

}
