package com.tka.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadOperation {

	public static void main(String[] args) {
		
		 Configuration cfg = new Configuration();
		 
		 cfg.configure("mysqlHibernate.cfg.xml");
		 
		 cfg.addAnnotatedClass(Product.class);
		 
		 SessionFactory sessionFactory = cfg.buildSessionFactory();
		 
		 Session session = sessionFactory.openSession();
		 
//		 Transaction txn = session.beginTransaction();
		 
		 
		 
//		 Product obj = session.load(Product.class, 3); // NoObjectFound exception
		 Product obj = session.get(Product.class, 2); // it gives null if not found in DB
		 System.out.println(obj);
		 System.out.println("Product read successfully");
		 
//		 txn.commit();
		 
		 session.close();
		 sessionFactory.close();
		 

	}

}
