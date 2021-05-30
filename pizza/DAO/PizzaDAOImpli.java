package com.xworkz.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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

		}

	}

	@Override
	public void getPizzaData(int n) {

		Session session = null;
		try {
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			PizzaDTO pizzaDTO = session.get(PizzaDTO.class, n);

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
	public void updatePizzaData(int n) {

		Session session = null;
		try {
			SessionFactory sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			PizzaDTO dto = session.get(PizzaDTO.class, n);
			dto.setPrice(187);
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
	public void deleteSelectedData(int n) {
		Session session = null;
		Transaction transaction = null;
		try {

			SessionFactory sessionFactory = single.SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			PizzaDTO pizzaDTO = session.get(PizzaDTO.class, n);
			transaction = session.beginTransaction();
			session.delete(pizzaDTO);
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
///===================named query=====================================
	@Override
	public void fetchAllPizzaData() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SingleTon.getSessionFactory();
			session = factory.openSession();
			Query query = session.createNamedQuery("getAllData");
			List<PizzaDTO> list = query.list();
			for (PizzaDTO pizzaDTO : list) {
				System.out.println(pizzaDTO);
			}

		} catch (Exception e) {
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
	public void getTotalPriceOfAllPizza() {

		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getTotalPrice");
			List list = query.list();
			
			System.out.println("Total price of your pizza is:"+list);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
		}
		SingleTon.close();
	}

	@Override
	public void getPizzaPriceByName(String pizzaName) {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getPriceByName");
			query.setParameter("pizzaName", pizzaName);
			
			List list = query.list();
			
			System.out.println("price of your selected pizza is:"+list);
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
		}
		SingleTon.close();
		
		
	}

	@Override
	public void getMaxPriceOfPizza() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getMaxPrice");
			List list = query.list();
			
			System.out.println("maximum price of  pizza is:"+list);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
		}
		SingleTon.close();		
	}

	@Override
	public void getMinPriceOfPizza() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getMinPrice");
			List list = query.list();
			
			System.out.println("minimum price of  pizza is:"+list);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
		}
		SingleTon.close();		
	}

	@Override
	public void getAvgPriceOfPizza() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SingleTon.getSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getAvgPrice");
			List list = query.list();
			
			System.out.println("average price of all pizza is:"+list);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
		}
		SingleTon.close();		
	}

	@Override
	public void loadFirstResultAndMaxResult(int startpoint,int endpoint) {
		SessionFactory sessionFactory=null;
		Session session=null;
		try {
			 sessionFactory= SingleTon.getSessionFactory();
			 session = sessionFactory.openSession();
			 Query query = session.getNamedQuery("loadFirstResultAndMaxResult");
			 query.setFirstResult(startpoint);
			 query.setMaxResults(endpoint);
			 List<PizzaDTO> list = query.list();
			 for (PizzaDTO pizzaDTO : list) {
				System.out.println(pizzaDTO);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}
		}
		SingleTon.close();	
		
	}
}