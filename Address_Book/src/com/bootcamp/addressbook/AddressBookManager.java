package com.bootcamp.addressbook;

import java.util.Scanner;

public class AddressBookManager implements AddressBookManagerInterface {
	
	public void newAddressBook() {
		AddressBook ab=new AddressBook();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book name");
		String name =sc.next();
		
		
		System.out.println("-----------------------");
		System.out.println("1 : for addPerson");
		System.out.println("-----------------------");
		int choice =sc.nextInt();
		switch (choice) {
		case 1: 
			ab.addPerson();
		
		}
		
		
	}//newAddressBook()
	
	public void openAddressBook() {
		AddressBook ab=new AddressBook();
		
		
		ab.display();
		
	}//openAddressBook()
	
	public void saveAddressBook() {
		AddressBook ab=new AddressBook(); 
		
		
	}//saveAddressBook()
	
	public void saveAsAddressBook() {
		 
		
	}//aveAsAddressBook()
	
	public void closeAddressBook() {
		
		
	}//closeAddressBook()
	
	public void quit() {
		
		
	}//quit()
	
}//AddressBookMng class
