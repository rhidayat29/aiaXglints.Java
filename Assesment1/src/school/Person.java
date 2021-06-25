package school;

import java.util.Scanner;

abstract class Person {
	
	protected String nameIs;
	protected String addressIs;
	Scanner myObj = new Scanner(System.in);
	public Person() {
	    System.out.print("Enter Name: ");
        String name = myObj.nextLine();
        System.out.print("Enter Address: ");
        String address = myObj.nextLine();// Read user input
        
		nameIs = name;
		addressIs = address;
	}
	
	public String getName() {
		return nameIs;
	}
	
	public String getAddress() {
		return addressIs;
	}
	
	public void setAddress(String addressInput) {
		
		
	}
	
	public String toString() {
		return  nameIs +" ("+ addressIs + ") ";
	}
	
//	public void hello(String nameIs) {
//		System.out.println("Hello iam " + nameIs);
//	}
}
	
