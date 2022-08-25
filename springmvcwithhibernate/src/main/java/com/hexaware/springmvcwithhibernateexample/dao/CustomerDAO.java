package com.hexaware.springmvcwithhibernateexample.dao;

import java.util.List;

import com.hexaware.springmvcwithhibernateexample.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(int custId);
	public void deleteCustome(int custId);

}
