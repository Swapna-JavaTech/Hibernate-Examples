package com.hexaware.manytomanyusingxml.entity;

import java.util.HashSet;
import java.util.Set;

public class Group {
	
	private long id;
	private String grpName;
	
	private Set<User> users = new HashSet<User>();
	
	public Group() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Group(String grpName) {
		super();
		this.grpName = grpName;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGrpName() {
		return grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	public void addUser(User user) {
		this.users.add(user);
	}
}
