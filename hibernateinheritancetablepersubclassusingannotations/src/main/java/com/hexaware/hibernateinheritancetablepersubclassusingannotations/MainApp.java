package com.hexaware.hibernateinheritancetablepersubclassusingannotations;

import org.hibernate.Session;

import org.hibernate.Transaction;

import com.hexaware.hibernateinheritancetablepersubclassusingannotations.util.HibernateUtil;

import com.hexaware.hibernateinheritancetablepersubclassusingannotations.entity.AmazonCustomer;
import com.hexaware.hibernateinheritancetablepersubclassusingannotations.entity.PrimeCustomer;
import com.hexaware.hibernateinheritancetablepersubclassusingannotations.entity.RegularCustomer;

public class MainApp {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		AmazonCustomer cust = new AmazonCustomer("Rama", "434242424232", "ram@gmail.com");
		PrimeCustomer pcust = new PrimeCustomer();
		pcust.setCustomerName("Raja");
		pcust.setCustomerMobileNo("5664564654");
		pcust.setCustomerEmail("raj@gmail.com");
		pcust.setValidityOfSubscription("3");
		RegularCustomer rcust = new RegularCustomer();
		rcust.setCustomerName("Rag");
		rcust.setCustomerMobileNo("4444564654");
		rcust.setCustomerEmail("rag@gmail.com");
		rcust.setDeliveryDuration(7);
		try {
			session= HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			//save thes student object
			session.persist(cust);
			session.persist(pcust);
			session.persist(rcust);
			transaction.commit();
			//session.close();
			
		}catch (Exception e) {
			if(transaction!= null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		

		System.out.println("completed....");
	}

}
