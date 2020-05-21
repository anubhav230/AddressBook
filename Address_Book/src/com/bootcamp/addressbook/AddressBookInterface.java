package com.bootcamp.addressbook;

public interface AddressBookInterface {
	public void addPerson();
	public void searchPerson(String searchWord);
	public void editPerson();
	
	public void deletePerson();
	
	public void sortByName();
	
	public void sortByZip();
	
	public void display();
	
}
