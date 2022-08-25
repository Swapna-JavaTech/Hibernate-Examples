package com.hexaware.springmvcwithhibernateexample.service;

import java.util.List;

import com.hexaware.springmvcwithhibernateexample.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(int custId);
	public void deleteCustome(int custId);
}
