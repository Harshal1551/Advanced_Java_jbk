package com.tka.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateProduct {

	public static void main(String[] args) {
		
		 Configuration cfg = new Configuration();
		 
		 cfg.configure("mysqlHibernate.cfg.xml");
		 
		 cfg.addAnnotatedClass(Product.class);
		 
		 SessionFactory sessionFactory = cfg.buildSessionFactory();
		 
		 Session session = sessionFactory.openSession();
		 
		 Transaction txn = session.beginTransaction();
		 
		 
		 Product obj = new Product("Asus Laptop", 80000, "Electronics", 10);
		 
		 session.saveOrUpdate(obj);
		 System.out.println("Inserted Successfully");
		 
		 txn.commit();
		 
		 session.close();
		 sessionFactory.close();
		 

	}
}
