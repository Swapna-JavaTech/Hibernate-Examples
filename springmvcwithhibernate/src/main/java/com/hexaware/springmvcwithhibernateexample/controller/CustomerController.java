package com.hexaware.springmvcwithhibernateexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hexaware.springmvcwithhibernateexample.entity.Customer;
import com.hexaware.springmvcwithhibernateexample.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService custService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		List<Customer> customerList = custService.getCustomers();
		theModel.addAttribute("customers",customerList);
		return "list-customers";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Customer cust = new Customer();
		theModel.addAttribute("customer",cust);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		custService.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("customerId") int custId,Model theModel) {
		Customer cust = custService.getCustomer(custId);
		theModel.addAttribute("customer",cust);
		return "customer-form";
	}

	@DeleteMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int custId) {
		custService.deleteCustome(custId);
		return "redirect:/customer/list";
	}
}
