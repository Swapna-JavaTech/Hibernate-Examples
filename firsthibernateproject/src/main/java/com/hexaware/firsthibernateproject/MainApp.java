package com.hexaware.firsthibernateproject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hexaware.firsthibernateproject.entity.Student;
import com.hexaware.firsthibernateproject.util.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		
		Student st = new Student("Rama","Krishna","rk@gmail.com");
		Student st1 = new Student("Raja","Ram","rr@gmail.com");
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction = session.beginTransaction();
			//save the student objects to db
			session.save(st1);
			session.save(st);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			List<Student>  students = session.createQuery("from Student", Student.class).list();
			students.forEach(s -> System.out.println(s.getStudentFirstName()));
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}

	}

}
