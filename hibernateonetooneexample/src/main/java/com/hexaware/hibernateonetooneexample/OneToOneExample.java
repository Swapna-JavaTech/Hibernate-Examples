package com.hexaware.hibernateonetooneexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernateonetooneexample.model.Employee;
import com.hexaware.hibernateonetooneexample.model.EmployeeDetails;
import com.hexaware.hibernateonetooneexample.util.HibernateUtil;

public class OneToOneExample {
	
	public static void main(String...args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee emp = new Employee();
		emp.setEmpId(12023L);
		emp.setEmpName("Rama");
		emp.setEmpEmail("ram@gmail.com");
		emp.setEmpSalary(45000);
		
		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.setEmpBaseLocation("Chennai");
		empDetails.setEmpPassportNo("KM034056");
		empDetails.setEmpPermAddr("OMR Chennai");
		empDetails.setEmpTotalExp(13);
		empDetails.setEmployee(emp);
		
		Transaction tx = session.beginTransaction();
		session.save(empDetails);
		tx.commit();
		session.close();
		sessionFactory.close();
	}

}
