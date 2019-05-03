package com.homeIns.model.objects;

import com.homeIns.model.exceptions.InvalidSocialSecurityNumber;

public class SocialSecurityNumber {
	final int MIN_VALUE = 000000000;
	final int MAX_VALUE = 999999999;
	
	private int SSN;
	public SocialSecurityNumber(int num) throws InvalidSocialSecurityNumber {
		if (num>= MIN_VALUE && num <=MAX_VALUE) 
		{
			this.SSN = num;
		}
		else 
		{
			throw new InvalidSocialSecurityNumber("Invalid SSN number. "
					+ num + " should be > " + MIN_VALUE +" and < "+ MAX_VALUE + ". ");
		}
	}
	public int getSSN() {
		return SSN;
	}
	@Override
	public String toString() {
		return "SocialSecurityNumber [SSN=" + SSN + "]";
	}
}
