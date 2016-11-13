package transportBooking;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestBooking {
	
	public static void main(String[] args) 
			throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		
		// Setting up Receipt to write to a file
		PrintWriter outReceipt = new PrintWriter("Your Receipt.dat");
		outReceipt.print("Deegan Travel: ");
		
		String travel;
		
		System.out.println("Welcome to Deegan Travel Agency\n");
		System.out.println("Providers of Booking for Air, Bus or Rental Car\n");
		System.out.println("Please Enter Transport Needed (Air, Bus or Car): ");
		travel = console.nextLine();
		
		if (travel.equalsIgnoreCase("air")){
	
			Airline myAirline = new Airline();
			myAirline.enterDetails();
			myAirline.enterAirline();
			myAirline.toString();
			System.out.println("\n" + myAirline.toString());
			outReceipt.printf(myAirline.toString());
			myAirline.payBookingFee();
		}
		else if (travel.equalsIgnoreCase("bus")){
			Bus myBus = new Bus();
			myBus.enterDetails();
			myBus.enterBusDetails();
			System.out.println("\n" + myBus.toString());
			outReceipt.printf(myBus.toString());
		}
		else if (travel.equalsIgnoreCase("car")){
			CarRental myCar = new CarRental();
			myCar.enterDetails();
			myCar.enterBusDetails();
			System.out.println("\n" + myCar.toString());
			outReceipt.printf(myCar.toString());
			myCar.deposit();
		}
		
		outReceipt.close();
	}

}
