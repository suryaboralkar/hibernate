package com.xworkz.xworkzapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.xworkzapp.dto.InstaDTO;

import single.SingleTon;

public class InstaDAOImpli implements InstaDAO {

	public void saveData(InstaDTO dto) {

		Session session = null;
		try {
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("connection closed");
			} else
				System.out.println("connection not closesd");
		}

	}

	public void getData() {
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			InstaDTO dto = session.get(InstaDTO.class, 3);
			System.out.println(dto);

		} catch (Exception e) {
		} finally {
			if (session != null) {
				session.close();
				System.out.println("connection closed");
			} else
				System.out.println("connection not closesd");
		}

	}

	
	
	@Override
	public void updataInstaData() {

		Session session = null;
		try {
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			
			InstaDTO dto = session.get(InstaDTO.class, 1);
			dto.setType("private");
			
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
	public void deleteselectedData() {
		Session session = null;
		Transaction transaction =null;
		try {
			
		SessionFactory sessionFactory = single.SingleTon.getSessionFactory();
		 session = sessionFactory.openSession();
		 InstaDTO dto = session.get(InstaDTO.class, 1);
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
