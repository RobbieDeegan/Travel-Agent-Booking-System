package transportBooking;

import java.util.Scanner;

public abstract class PersonalDetails {
	
	Scanner console = new Scanner(System.in);
	
	// Global Variables
	public static String firstName;
	public static String secondName;
	public static String leaving;
	public static String destination;
	public static String airLine;
	public static String busComapany;
	public static String rentalComapany;
	public static String carBrand;
	public static int numAdults;
	public static int numChildren;
	
	// Getting Personal Details
	public void enterDetails(){
				
		System.out.println("Enter First Name: ");
		firstName = console.nextLine();
		
		System.out.println("Enter Second Name: ");
		secondName = console.nextLine();
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	
	public void setSecondName(String secondName){
		this.secondName = secondName;
	}
	public String getSecondName(){
		return secondName;
	}
	
	// Output of Ticket Details
	public String toString(){
		return ("Ticket Details: \n" + getFirstName() + " " + getSecondName());
		}

}
