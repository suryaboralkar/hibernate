package com.xworkz.xworkzapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.xworkzapp.dto.InstaDTO;

public class InstaDAOImpli implements InstaDAO {

	public void saveData(InstaDTO dto) {

		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
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
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("connection closed");
			} else
				System.out.println("connection not closed");
		}

	}

	public void getData() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
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
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("connection closed");
			} else
				System.out.println("connection not closed");
		}

	}

}
