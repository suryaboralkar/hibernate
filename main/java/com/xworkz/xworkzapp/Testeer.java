package com.xworkz.xworkzapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.xworkzapp.data.Sanitizer;
import com.xworkz.xworkzapp.data.SuperMarket;
import com.xworkz.xworkzapp.data.VaccinationCenter;

public class Testeer {

	public static void main(String[] args) {

		    String spring="spring.xml";
		    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(spring);
		    SuperMarket market = context.getBean(SuperMarket.class);
		    System.out.println(market);
		    System.out.println("**********************************************");
		    Sanitizer sani = context.getBean(Sanitizer.class);
		    System.out.println(sani);
		    System.out.println("**********************************************");
            VaccinationCenter vc = context.getBean(VaccinationCenter.class);
            System.out.println(vc);
		    
	}

}
