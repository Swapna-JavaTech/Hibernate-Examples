package com.hexaware.manytomanyusingxml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hexaware.manytomanyusingxml.entity.Group;
import com.hexaware.manytomanyusingxml.entity.User;

public class ManyToManyExample {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		 Group groupAdmin = new Group("Administrator Group");
	        Group groupGuest = new Group("Guest Group");
	         
	        User user1 = new User("Tom", "tomcat", "tom@abc.net");
	        User user2 = new User("Mary", "mary", "mary@abc.net");
	         
	        groupAdmin.addUser(user1);
	        groupAdmin.addUser(user2);
	         
	        groupGuest.addUser(user1);
	         
	        user1.addGroup(groupAdmin);
	        user2.addGroup(groupAdmin);
	        user1.addGroup(groupGuest);
	         
	        session.save(groupAdmin);
	        session.save(groupGuest);
	        
	        tx.commit();
	        session.close();

	}

}
