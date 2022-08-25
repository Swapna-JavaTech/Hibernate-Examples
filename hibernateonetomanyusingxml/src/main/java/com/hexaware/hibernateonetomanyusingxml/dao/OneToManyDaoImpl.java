package com.hexaware.hibernateonetomanyusingxml.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernateonetomanyusingxml.entity.Employee;
import com.hexaware.hibernateonetomanyusingxml.util.HibernateUtil;

public class OneToManyDaoImpl implements OneToManyDao {

	public void saveEmployee(Employee employee) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();
		sessionFactory.close();
		
	}

}
