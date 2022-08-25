package com.hexaware.onetomanyunidirectionalexampleusingannotations.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hexaware.onetomanyunidirectionalexampleusingannotations.entity.Department;
import com.hexaware.onetomanyunidirectionalexampleusingannotations.util.HibernateUtil;


public class DepartmentDao {
	Transaction tx = null;
	public void saveEmployee(Department dept) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			tx = session.beginTransaction();
			//save the employee
			session.save(dept);
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
