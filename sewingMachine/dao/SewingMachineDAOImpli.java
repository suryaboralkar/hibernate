package com.xworkz.sewingMachine.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.sewingMachine.dto.SewingMachineDTO;

public class SewingMachineDAOImpli implements SewingMachineDAO{

	@Override
	public void saveData(SewingMachineDTO sewingDTO) {

		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
	         session.save(sewingDTO);
			
			transaction.commit();
		}
		catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
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

	@Override
	public void getData() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			SewingMachineDTO dto = session.get(SewingMachineDTO.class, 1);
			System.out.println(dto);
	        
			
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
