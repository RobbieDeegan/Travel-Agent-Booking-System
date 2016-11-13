package transportBooking;

import java.util.Scanner;

public class CarRental extends PersonalDetails implements Deposit{
	
Scanner console = new Scanner(System.in);
	
	// Bringing in Names from PersonalDetails
	public CarRental(){
		super();
	}
	
	// Getting Rental Booking Details
		public void enterBusDetails(){
			
			System.out.println("Enter the Car Rental Company: ");
			rentalComapany = console.nextLine();
		
			System.out.println("Enter Car Brand you would like: ");
			carBrand = console.nextLine();
		}
		

		public String toString(){
			return ("Car Rental Ticket: \n" + super.toString() + " borrowing a " + carBrand + " from "
					+ rentalComapany);
		}
		
		public void deposit(){
			System.out.println("\n€100 added for Deposit on Rented Car");
		}
}
