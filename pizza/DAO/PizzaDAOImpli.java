package com.xworkz.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;
import com.xworkz.DTO.PizzaDTO;

import single.SingleTon;

public class PizzaDAOImpli implements PizzaDAO {

	@Override
	public void savePizzaData(PizzaDTO pizzaDTO) {

		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
			 session = sessionFactory.openSession();
			 transaction = session.beginTransaction();
			session.save(pizzaDTO);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
			   SingleTon.close();
		}

	}

	@Override
	public void getPizzaData() {

		Session session = null;
		try {
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			PizzaDTO pizzaDTO = session.get(PizzaDTO.class, 4);
			
			
			System.out.println(pizzaDTO);

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
			SingleTon.close();
		}

	}

	@Override
	public void updatePizzaData() {

		Session session = null;
		try {
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			PizzaDTO dto = session.get(PizzaDTO.class, 2);
			dto.setPrice(199);
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(dto);
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
		SingleTon.close();
		}
	}

	@Override
	public void deleteSelectedData() {
		Session session = null;
		Transaction transaction =null;
		try {
			
		SessionFactory sessionFactory = single.SingleTon.getSessionFactory();
		 session = sessionFactory.openSession();
		PizzaDTO pizzaDTO = session.get(PizzaDTO.class, 6);
		 transaction = session.beginTransaction();
		 session.delete(pizzaDTO);
		    transaction.commit();
		}catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}	finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
			SingleTon.close();
			
	}
		
	}
	
}