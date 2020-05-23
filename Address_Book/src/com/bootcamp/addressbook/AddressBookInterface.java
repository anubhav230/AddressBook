package com.bootcamp.addressbook;

public interface AddressBookInterface {
	public void addPerson();
	public void searchPerson(String searchWord);
	public void editPerson();
	
	public void deletePerson(String searchWord);
	
	public void sortByName();
	
	public void sortByZip();
	
	public void display();
	
}
