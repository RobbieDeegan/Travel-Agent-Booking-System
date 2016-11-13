package transportBooking;

import java.util.Scanner;

public class Bus extends PersonalDetails {
		
	Scanner console = new Scanner(System.in);
	
	// Bringing in Names from PersonalDetails
	public Bus(){
		super();
	}
	
	// Getting Bus Booking Details
		public void enterBusDetails(){
			
			System.out.println("Enter County your Leaving: ");
			leaving = console.nextLine();
			
			System.out.println("Enter your Destenation: ");
			destination = console.nextLine();
			
			System.out.println("Enter the Bus Company your travelling with: ");
			busComapany = console.nextLine();
			
			System.out.println("Enter the number of Adults: ");
			numAdults = console.nextInt();
			if (numAdults < 0 ){
				System.out.println("Please enter valid number: ");
				System.out.println("Enter the number of Adults: ");
				numAdults = console.nextInt();
			}
			
			System.out.println("Enter the number of Children: ");
			numChildren = console.nextInt();
			if (numChildren < 0 ){
				System.out.println("Please enter valid number: ");
				System.out.println("Enter the number of Children: ");
				numChildren = console.nextInt();
			}
		}
		

		public String toString(){
			return ("County Bus Ticket: \n" + super.toString() + " leaving " + leaving + " going to " + destination
			+ " with " + busComapany + " \n" + "Adults:" + numAdults + " Children: " +  numChildren);
		}

}
