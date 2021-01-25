package com.aitrich.inventorysystem.read;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aitrich.inventorysystem.domain.Item;

public class ItemRead {
 
	
private Scanner userInputScanner;
	
	public Item buildItem() {
		System.out.println("======Building the itemr======");
		userInputScanner = new Scanner(System.in);
		Item item = new Item();
		askItemNo(item);
		askItemName(item);
		askUnitPrice(item);
		
		System.out
				.println("==================================================================================");
		return item;

	}
	private void askItemNo(Item item) {
		// TODO: Implement this..
		System.out.println("Please enter itemno:");
		try {
			item.setItemno(userInputScanner.nextInt());
			if (item.getItemno() == 0) {
				askItemNo(item);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Incorrect data");
		item.setItemno(0);
		}
		System.out
				.println("==================================================================================");
	}
	
	private void askItemName(Item item) {
		// TODO: Implement this..
		System.out.println("Please enter item name:");
		try {
			item.setItemName(userInputScanner.next());

			if (item.getItemName() == null
					|| item.getItemName().trim().equals("")) {
				askItemName(item);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Your data format is incorrect:");
			item.setItemName(null);
			// e.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}
	private void askUnitPrice(Item item) {
		// TODO: Implement this..
		System.out.println("Please enter item unit price:");
		try {
			item.setUnitPrice(userInputScanner.next());

			if (item.getUnitPrice() == null
					|| item.getUnitPrice().trim().equals("")) {
				askUnitPrice(item);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Your data format is incorrect:");
			item.setUnitPrice(null);
			// e.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}
	 
}
 
