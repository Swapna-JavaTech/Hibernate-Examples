package com.hexaware.hibernateinheritanctableperconcreteclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hexaware.hibernateinheritanctableperconcreteclass.entity.AmazonCustomer;
import com.hexaware.hibernateinheritanctableperconcreteclass.entity.PrimeCustomer;
import com.hexaware.hibernateinheritanctableperconcreteclass.entity.RegularCustomer;

public class MainApp {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
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
		
		session.persist(cust);
		session.persist(pcust);
		session.persist(rcust);
		tx.commit();
		session.close();
		System.out.println("completed....");
	}

}
