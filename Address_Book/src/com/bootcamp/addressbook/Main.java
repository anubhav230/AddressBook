package com.bootcamp.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public void options() {
		System.out.println("1 : Create new address book");
		System.out.println("2 : Open address book");
		System.out.println("3 : Save address book");
		System.out.println("4 : Saveas new address book");
		System.out.println("5 : exit");
		
	}
	public static List<Person> list = new ArrayList<Person>();
	
	public static void write(String filePath) {
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Main mn=new Main();
		AddressBookManager addBookManager=new AddressBookManager();
		
		
		for(int i=1;i>0;i++) {
			
		mn.options();
		
		int choice = scanner.nextInt();
		
		
		switch(choice){
		case 1:
			
			addBookManager.newAddressBook();
			mn.options();
			break;
		case 2:
			
			//System.out.println("Enter Address Book name");
			//
			System.out.println("1 : display");
			System.out.println("2 : addPerson");
			System.out.println("3 : editPerson");
			System.out.println("4 : deletePerson");
			System.out.println("5 : sortByName");
			System.out.println("6 : sortByZip");
			System.out.println("7 : search person");
			
			int choice2 = scanner.nextInt();

			
			switch(choice2) {
			case 1:
				addBookManager.openAddressBook();
				break;
			case 7:
				String searchWord;
				Scanner sc= new Scanner(System.in);
				AddressBook ab = new AddressBook();
				searchWord=sc.next();
				ab.searchPerson(searchWord);
				break;
			}
			break;
		case 3:
			
			
			addBookManager.saveAddressBook();
			
			
			break;
		case 4:
			addBookManager.saveAsAddressBook();
			break;
		case 5:
			addBookManager.quit();
			break;
			
			
			
		}//switch
		}//for
		

	}//main()

}//mainclass
