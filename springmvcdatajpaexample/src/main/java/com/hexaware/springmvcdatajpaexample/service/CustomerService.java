package com.hexaware.springmvcdatajpaexample.service;

import java.util.List;

import com.hexaware.springmvcdatajpaexample.entity.Customer;
import com.hexaware.springmvcdatajpaexample.exception.ResourceNotFoundException;



public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId) throws ResourceNotFoundException;

    public void deleteCustomer(int theId) throws ResourceNotFoundException;
}