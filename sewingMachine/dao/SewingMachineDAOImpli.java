package com.xworkz.xworkzapp.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.xworkzapp.dto.SewingMachineDTO;

import single.SingleTon;

public class SewingMachineDAOImpli implements SewingMachineDAO{

	@Override
	public void saveData(SewingMachineDTO sewingDTO) {

		Session session = null;
		try {
			
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
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
			
		}

	}

	@Override
	public void getData() {
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
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
		}
		
		
	}
	@Override
	public void updateData() {

		Session session = null;
		try {
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			SewingMachineDTO dto = session.get(SewingMachineDTO.class, 1);
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
		}
	}

	@Override
	public void deleteData() {
		Session session = null;
		Transaction transaction =null;
		try {
			
		SessionFactory sessionFactory = single.SingleTon.getSessionFactory();
		 session = sessionFactory.openSession();
		 SewingMachineDTO dto = session.get(SewingMachineDTO.class, 1);
		 transaction = session.beginTransaction();
		 session.delete(dto);
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
