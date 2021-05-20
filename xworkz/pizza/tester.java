package com.xworkz.pizza;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.DTO.PizzaDTO;

public class tester {
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		PizzaDTO pizzaDTO = new PizzaDTO("chicken sausage", "bellandur", 125, true, "regular", "non-veg");
		Transaction transaction = session.beginTransaction();
		session.save(pizzaDTO);
		transaction.commit();
		
		
	}

}
