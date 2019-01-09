// Author: Nick Korintus

import java.util.Scanner;

public class CustomerDemo
{
	public static void main(String[] args)
	{
		String name;		// The customer's name
		String phone;		// The customer's telephone number
		String address;		// The customer's address
		String number;		// The customer number
		String input;		// Holds input from keyboard
		boolean mail;		// Indicator to for mailing list or not

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get customer's name
		System.out.print("Enter name: ");
		name = keyboard.nextLine();

		// Get customer's telephone number
		System.out.print("Enter telephone number: ");
		phone = keyboard.nextLine();

		// Get customer's address
		System.out.print("Enter address: ");
		address = keyboard.nextLine();

		// Get the customer number
		System.out.print("Enter customer number: ");
		number = keyboard.nextLine();

		// Ask if customer wants to be the mailing list or not
		System.out.print("Does customer wish to be on mailing list(Y/N): ");
		input = keyboard.nextLine();

		// Set boolean value to either true or false based on input from user
		if((input.charAt(0) == 'Y') || (input.charAt(0) == 'y'))
			mail = true;
		else
			mail = false;

		// Create a customer object and pass the details to the constructor
		Customer cust = new Customer(name, phone, address, number, mail);

		// Store data in the customer object
		cust.setName(name);
		cust.setTelephone(phone);
		cust.setAddress(address);
		cust.setNumber(number);
		cust.setStatus(mail);

		// Display the customer's details
		System.out.println("\nHere are the customer's details: ");
		System.out.println("Name: " + cust.getName());
		System.out.println("Telephone number: " + cust.getTelephone());
		System.out.println("Address: " + cust.getAddress());
		System.out.println("Customer number: " + cust.getNumber());
		System.out.println("On mailing list: " + cust.getStatus());
	}
}
