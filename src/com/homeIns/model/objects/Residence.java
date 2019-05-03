package com.homeIns.model.objects;

public class Residence {

	static enum Types {
		SingleFamilyHome, 
		Condo, 
		Townhouse, 
		Rowhouse, 
		Duplex, 
		Apartment
	}
	static enum Use {
		Primary, 
		Secondary, 
		Rental 
	}
	
	String type;
	String use;
	String address1 = "";
	String address2 = "";
	String city;
	String state;
	int zip;
	
	public Residence(String type, String use, String address1, String address2, String city, String state, int zip) {
		super();
		this.type = type;
		this.use = use;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
}
