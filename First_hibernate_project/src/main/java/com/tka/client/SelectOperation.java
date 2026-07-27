package com.tka.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectOperation {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		cfg.addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Student obj = session.load(Student.class, 2);

		System.out.println(obj);
		session.close();

	}
}
