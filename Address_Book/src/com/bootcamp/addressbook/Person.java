package com.bootcamp.addressbook;



public class Person extends Address {
	private String firstName;
	private String lastName;
	private int mobileNumber;
	Address address=new Address();

	
	
	
	public void setFristName(String firstName) {
		this.firstName = firstName;
		
	}//setFristName()
	
	public String getFristName() {
		return firstName;
		
	}//getFristNamev()
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}//setLastName()
	
	public String getLastName() {
		return lastName;
	}//getLastName()
	
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
		
	}//setMobileNumber()
	
	public int getMobileNumber() {
		return mobileNumber;
	}//getMobileNumber()
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress(Address address) {
		return address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + "]";
	}

	
}//class
	
	
	












