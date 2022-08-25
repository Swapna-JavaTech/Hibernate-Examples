package com.hexaware.springmvcwithhibernateexample.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springmvcwithhibernateexample.dao.CustomerDAO;
import com.hexaware.springmvcwithhibernateexample.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO custDAO;

	@Transactional
	public List<Customer> getCustomers() {
		return custDAO.getCustomers();
	}

	@Transactional
	public void saveCustomer(Customer customer) {
		custDAO.saveCustomer(customer);
		
	}

	@Transactional
	public Customer getCustomer(int custId) {
		return custDAO.getCustomer(custId);
	}

	@Transactional
	public void deleteCustome(int custId) {
		custDAO.deleteCustome(custId);
		
	}

}
