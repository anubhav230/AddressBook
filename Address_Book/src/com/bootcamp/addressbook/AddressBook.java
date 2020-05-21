package com.bootcamp.addressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook extends Person implements AddressBookInterface {
	private static final String CSV_HEADER = "FristName,LastName,mobileNumber,state,city,zip";
	Person pr = new Person();
	private static String filePath = "abc.csv";
	FileWriter fileWriter = null;
	
	
	public void addPerson() {
		String addbook;
		FileWriter fileWriter = null;
		Scanner scanner = new Scanner(System.in);
		AddressBookManager addBookManager = new AddressBookManager();
		List<Person> user = new ArrayList<>();
		
		
		System.out.println("Enter first name");
		String firstName=scanner.next();
		pr.setFristName(firstName);
		System.out.println("Enter last name");
		String lastName=scanner.next();
		pr.setLastName(lastName);
		System.out.println("mobile number");
		int mobileNumber=scanner.nextInt();
		pr.setMobileNumber(mobileNumber);
		System.out.println("Enter state");
		String state=scanner.next();
		Address address=new Address(); 
		address.setState(state);
		System.out.println("Enter city name");
		String city=scanner.next();
		address.setCity(city);
		System.out.println("Enter zip");
		int zip=scanner.nextInt();
		address.setZip(zip);
		
		//System.out.println(pr.getFristName());
		
		//System.out.println(address.getCity()+" "+address.getZip());
		 
		try {
			fileWriter = new FileWriter(filePath,true);
			
			//fileWriter.append(CSV_HEADER);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			PrintWriter pw= new PrintWriter(bw);
			//StringBuilder sv= new StringBuilder();
			fileWriter.append("");
			
				pw.println(pr.getFristName()+","+pr.getLastName()+","+pr.getMobileNumber()+","+address.getState()+","+address.getCity()+","+address.getZip());

				pw.flush();
				pw.close();

			//}
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
	} /*finally {
	try {
				pw.flush();
				pw.close();
		      } catch (IOException eu) {
		        System.out.println("Flushing/closing error!");
		              eu.printStackTrace();
		}*/
		
		//}
		
	
		
	}//addPerson()
	
	public void display() {
		String fileName="D:\\Ad Java\\Address_Book\\abc.csv";
		File file=new File(fileName);
		
		try {
			Scanner inputStream = new Scanner(new File(fileName));
			while(inputStream.hasNext()) {
				String data=(inputStream.next());
				System.out.println(data);
			}
			System.out.println("=============================");
			inputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
				
	}//display()
	
	public void editPerson() {
			
	}//editPerson()
	
	public void deletePerson() {
		
	}//deletePerson()
	
	public void sortByName() {
		
	}//sortByName()
	
	public void sortByZip() {
		
	}//sortByZip()
	
	
}//AddressBook class

