package com.homeIns.model.account.objects;

public class Admin extends User{

	public Admin(String username, String password, String fname, String lname) {
		super(username, password, fname, lname, true);
	}

}
