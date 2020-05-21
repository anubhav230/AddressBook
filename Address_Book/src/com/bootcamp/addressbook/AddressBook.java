package com.bootcamp.addressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class AddressBook extends Person implements AddressBookInterface {
	private static final String CSV_HEADER = "FristName,LastName,mobileNumber,state,city,zip";
	Person pr = new Person();
	private static String filePath = "abc.csv";
	FileWriter fileWriter = null;
	private static Formatter x;
	private static Scanner y;
	private static String choice, name;
	
	
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
		long mobileNumber=scanner.nextLong();
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
		System.out.println("1: for save data in file ");
		System.out.println("2: for skip data in file ");
		
		int i=scanner.nextInt();
		if (i==1) { 
			
		
		try {
			fileWriter = new FileWriter(filePath,true);
			
//			fileWriter.append(CSV_HEADER);
//			fileWriter.append('\n');
			BufferedWriter bw = new BufferedWriter(fileWriter);
			PrintWriter pw= new PrintWriter(bw);
			//StringBuilder sv= new StringBuilder();
			fileWriter.append("");
			//for (Person pr : user) {
				pw.println(pr.getFristName()+","+pr.getLastName()+","+pr.getMobileNumber()+","+address.getState()+","+address.getCity()+","+address.getZip());
//				pw.println(',');
//				pw.println(pr.getLastName());
//				pw.println(',');
//				pw.println(String.valueOf(pr.getMobileNumber()));
//				pw.println(',');
//				pw.println(pr.getState());
//				pw.println(',');
//				pw.println(pr.getCity());
//				pw.println(',');
//				pw.println(String.valueOf(pr.getZip()));
//				//pw.println('\n');
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
		
		System.out.println("data has been saved");
		}
		
		
		else {
			System.out.println("data not saved");
		}
			
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
	public void searchPerson(String searchWord) {
	
		
			 boolean found =false;
			 
			 String firstName=""; String lastName=""; String mobNo=""; String city=""; String state=""; String zip="";
			
			 try 
			 {
				 y=new Scanner(new File("abc.csv"));
				 y.useDelimiter("[,\n]");
				 while(y.hasNext() && found==false)
				 {
					firstName=y.next();
					System.out.println(firstName);
					lastName=y.next();
					mobNo=y.next();
					city=y.next(); 
					state=y.next();
					zip=y.next();
					if(mobNo.equals(searchWord))
						{
							found=true;
							System.out.println(firstName+","+lastName+","+mobNo+","+city+","+state+","+zip);
						}
					else
						{
							System.out.println("error");
						}
				 }
			 }
			 catch(Exception E)
			 {
				 System.out.println("Error");
			 }
	}
	public void editPerson() {
			
	}//editPerson()
	
	public void deletePerson() {
		
	}//deletePerson()
	
	public void sortByName() {
		
	}//sortByName()
	
	public void sortByZip() {
		
	}//sortByZip()
	
	
}//AddressBook class

