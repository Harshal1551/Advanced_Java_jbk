package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Student;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public Student registerStudent(Student student) {
		
	Session session = sessionFactory.openSession();
	
	session.beginTransaction();
	
	session.persist(student);
	
	session.getTransaction().commit();
	
	session.close();
		
		return student;
	}


	public List<Student> getAllStudent() {
		
		Session session = sessionFactory.openSession();
		
		Query<Student> query = session.createQuery("from Student", Student.class);
		
		List<Student> resultList = query.getResultList();
		
		session.close();
		
		return resultList;
	}

}
