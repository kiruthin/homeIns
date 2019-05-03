package com.homeIns.model.objects;

import java.time.LocalDate;
import java.util.ArrayList;

public class PolicyHolder {

	String FirstName;
	String LastName;
    LocalDate DOB;
    boolean Retiree;
    SocialSecurityNumber ssn;
    String email;
    ArrayList <Residence> residences = new ArrayList <Residence>();  

	public PolicyHolder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PolicyHolder [FirstName=" + FirstName + ", LastName=" + LastName + ", DOB=" + DOB + ", Retiree="
				+ Retiree + ", ssn=" + ssn + ", email=" + email + ", residences=" + residences + "]";
	}
	
}
