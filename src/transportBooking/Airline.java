package transportBooking;

import java.util.Scanner;

public class Airline extends PersonalDetails implements Fees {
	
	Scanner console = new Scanner(System.in);

	// Bringing in Names from PersonalDetails
	public Airline(){
		
		super();
	}
	
	// Getting Airline Booking Details
	public void enterAirline(){
		
		
		System.out.println("Enter Country your Leaving: ");
		leaving = console.nextLine();
		
		System.out.println("Enter your Destenation: ");
		destination = console.nextLine();
		
		System.out.println("Enter the Airline your travelling with: ");
		airLine = console.nextLine();
		
		System.out.println("Enter the number of Adults: ");
		numAdults = console.nextInt();
		if (numAdults < 0 ){
			System.out.println("Please enter valid number: ");
			System.out.println("Enter the number of Adults: ");
			numAdults = console.nextInt();
		}
		
		System.out.println("Enter the number of Children: ");
		numChildren = console.nextInt();
		if (numAdults < 0 ){
			System.out.println("Please enter valid number: ");
			System.out.println("Enter the number of Children: ");
			numChildren = console.nextInt();
		}
	}
	
	public void setLeaving(String leaving){
		this.leaving = leaving;
	}
	public String getLeaving(){
		return leaving;
	}
	
	public void setDestination(String destination){
		this.destination = destination;
	}
	public String getDestination(){
		return destination;
	}
	
	public void setAirLine(String airLine){
		this.airLine = airLine;
	}
	public String getAirLine(){
		return airLine;
	}
	
	public void setAdults(int numAdults){
		this.numAdults = numAdults;
	}
	public int getAdults(){
		return numAdults;
	}
	
	public void setChildren(int numChildren){
		this.numChildren = numChildren;
	}
	public int getChildren(){
		return numChildren;
	}
	
	public String toString(){
		return ("Airline Ticket: \n" + super.toString() + " leaving " + getLeaving() + " going to " + getDestination()
		+ " with " + getAirLine() + " \n" + "Adults:" + getAdults() + " Children: " +  getChildren());
	}
	
	public void payBookingFee(){
		System.out.println("\n€2.50 added for Airline Booking Fee");
	}

}
