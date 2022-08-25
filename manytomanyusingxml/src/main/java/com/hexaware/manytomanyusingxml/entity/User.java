package com.hexaware.manytomanyusingxml.entity;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private long id;
	private String userName;
	private String password;
	private String email;
	
	private Set<Group> groups = new HashSet<Group>();
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String password, String email, Set<Group> groups) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.groups = groups;
	}
	
	public User(String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Group> getGroups() {
		return groups;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}
	
	public void addGroup(Group group) {
		this.groups.add(group);
	}
	

}
