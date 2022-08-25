package com.hexaware.hibernateonetomanyusingxml.dao;

public class OneToManyDaoFactory {

	public static OneToManyDao getInstance() {
		return new OneToManyDaoImpl();
	}
}
