package com.xworkz.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.DTO.PizzaDTO;

public class PizzaDAOImpli implements PizzaDAO {

	@Override
	public void savePizzaData(PizzaDTO pizzaDTO) {

		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(pizzaDTO);
			transaction.commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("sessionFactory connection closed");
			} else {
				System.out.println("sessionFactory connection not closed");
			}
		}

	}

	@Override
	public void getPizzaData() {
		
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			PizzaDTO pizzaDTO = session.get(PizzaDTO.class, 4);
			System.out.println(pizzaDTO);
	        
			
		}
		catch (Exception e) {
			
		} 
		finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("sessionFactory connection closed");
			} else {
				System.out.println("sessionFactory connection not closed");
			}
		}
		
		
	}

}