package com.aitrich.inventorysystem.read;


import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Scanner;


import com.aitrich.inventorysystem.domain.Customer;

public class CustomerRead {
	private Scanner userInputScanner;
	
	public Customer buildCustomer() {
		System.out.println("======Building the Customer======");
		userInputScanner = new Scanner(System.in);
		Customer customer = new Customer();
		askCustomerId(customer);
		askCustomerName(customer);
		askCustomerAddress(customer);
		askCustomerEmail(customer);
		System.out
				.println("==================================================================================");
		return customer;

	}
	
	private void askCustomerId(Customer customer) {
		// TODO: Implement this..
		System.out.println("Please enter customer Id:");
		try {
			customer.setCustomerId(userInputScanner.nextInt());
			if (customer.getCustomerId() == 0) {
				askCustomerId(customer);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Incorrect data");
		customer.setCustomerId(0);
		}
		System.out
				.println("==================================================================================");
	}
	 
	private void askCustomerName(Customer customer) {
		// TODO: Implement this..
		System.out.println("Please enter customer name:");
		try {
			customer.setCustomerName(userInputScanner.next());

			if (customer.getCustomerName() == null
					|| customer.getCustomerName().trim().equals("")) {
				askCustomerName(customer);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Your data format is incorrect:");
			customer.setCustomerName(null);
			// e.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}
	
	private void askCustomerAddress(Customer customer) {
		// TODO: Implement this..
		System.out.println("Please enter customer address:");
		try {
			customer.setCustomerAddress(userInputScanner.next());

			if (customer.getCustomerAddress() == null
					|| customer.getCustomerAddress().trim().equals("")) {
				askCustomerAddress(customer);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Your data format is incorrect:");
			customer.setCustomerAddress(null);
			// e.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}
	
	private void askCustomerEmail(Customer customer) {
		// TODO: Implement this..
		System.out.println("Please enter customer email:");
		try {
			customer.setCustomeremail(userInputScanner.next());

			if (customer.getCustomeremail() == null
					|| customer.getCustomeremail().trim().equals("")) {
				askCustomerEmail(customer);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Your data format is incorrect:");
			customer.setCustomeremail(null);
			// e.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}
	
	
	
	/*System.out.println(customer.toString());*/

}
