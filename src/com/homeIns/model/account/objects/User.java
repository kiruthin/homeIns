package com.homeIns.model.account.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "username", unique=true)
	private String username;

	@Column(name = "password")
	private String password;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")	
	private String lname;
	
	@Column(name = "admin")
	protected boolean SuperUser;
	
	public User(){}
	public User(String username, String password, String fname, String lname, boolean superUser) {
		super();
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		SuperUser = superUser;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public boolean isSuperUser() {
		return SuperUser;
	}

	public void setSuperUser(boolean superUser) {
		SuperUser = superUser;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", fname=" + fname + ", lname=" + lname + ", SuperUser="
				+ SuperUser + "]";
	}
    
	
}
