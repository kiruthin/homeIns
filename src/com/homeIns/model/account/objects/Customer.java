package com.homeIns.model.account.objects;

import javax.persistence.Entity;

public class Customer extends User{

	public Customer() 
	{
		
	}
	public Customer(String username, String password, String fname, String lname) {
		super(username, password, fname, lname, false);
	}
}
