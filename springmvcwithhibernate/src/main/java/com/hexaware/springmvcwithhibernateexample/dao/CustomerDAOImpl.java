package com.hexaware.springmvcwithhibernateexample.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hexaware.springmvcwithhibernateexample.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
		Root<Customer> root = cq.from(Customer.class);
		cq.select(root);
		Query query = session.createQuery(cq); //select * from customer;
		return query.getResultList();
	}

	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	public Customer getCustomer(int custId) {
		Session session = sessionFactory.getCurrentSession();
		Customer cust = session.get(Customer.class, custId);
		return cust;
	}

	public void deleteCustome(int custId) {
		Session session = sessionFactory.getCurrentSession();
		Customer cust = session.byId(Customer.class).load(custId);
		session.delete(cust);
	}

}
