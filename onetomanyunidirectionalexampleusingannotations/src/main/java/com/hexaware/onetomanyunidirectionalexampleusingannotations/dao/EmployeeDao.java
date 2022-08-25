package com.hexaware.onetomanyunidirectionalexampleusingannotations.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hexaware.onetomanyunidirectionalexampleusingannotations.entity.Employee;
import com.hexaware.onetomanyunidirectionalexampleusingannotations.util.HibernateUtil;


public class EmployeeDao {
	Transaction tx = null;
	public void saveEmployee(Employee emp) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			tx = session.beginTransaction();
			//save the employee
			session.save(emp);
			//commit the transaction
			tx.commit();
		}catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		
	}

}
