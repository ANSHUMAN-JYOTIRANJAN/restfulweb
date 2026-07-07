package com.anshuman.rest.webservices.restful_web_services.versioning;

public class Name {
	private String FirstName;
	private String LastName;
	
	
	public Name(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	@Override
	public String toString() {
		return "Name [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
	
}
