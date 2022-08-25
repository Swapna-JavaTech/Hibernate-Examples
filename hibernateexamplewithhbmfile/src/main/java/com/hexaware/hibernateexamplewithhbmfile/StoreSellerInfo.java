package com.hexaware.hibernateexamplewithhbmfile;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hexaware.hibernateexamplewithhbmfile.entity.Seller;

public class StoreSellerInfo {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new  StandardServiceRegistryBuilder()
											.configure("hibernate.cfg.xml")
											.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Seller s1= new Seller("Krishna", "kris@gmail.com");
		session.save(s1);
		tx.commit();
		System.out.println("saved successfully");
		session.close();
		

	}

}
