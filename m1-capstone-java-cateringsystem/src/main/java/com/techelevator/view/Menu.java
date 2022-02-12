package com.techelevator.view;

import com.techelevator.CateringSystem;
import com.techelevator.filereader.InventoryFileReader;
import com.techelevator.items.CateringItem;

import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * This is the only class that should have any usage of System.out or System.in
 *
 * Usage of System.in or System.out should not appear ANYWHERE else in your code outside of this class.
 *
 * Work to get input from the user or display output to the user should be done in this class, however, it
 * should include no "work" that is the job of the catering system.
 */
public class Menu {
	
	private static final Scanner in = new Scanner(System.in);
	public Menu(){}

	public void showWelcomeMessage() {
		System.out.println("*************************");
		System.out.println("**     Weyland Corp.   **");
		System.out.println("**      Catering       **");
		System.out.println("*************************");
		System.out.println("(1) Display Catering Item");
		System.out.println("(2) Order");
		System.out.println("(3) Quit");
	}

	public String getInputFromUser(){
		System.out.println("Please select a number");
		return in.nextLine();
	}

	public void showItemsForSale(Map<String, CateringItem> inventory){
		for (Map.Entry<String, CateringItem> mapEntry : inventory.entrySet()){
			System.out.print(mapEntry.getValue().getProductCode());
			System.out.println(mapEntry.getValue().getDesciption());
			System.out.println(mapEntry.getValue().getPrice());
		}
	}

//	public void displayInventory(){
//		System.out.println(inventoryFileReader);
//	}

	public void displayError(String message) {
		System.out.println("***** ERROR *****");
		System.out.println(message);
	}



// 1. we need to make sure the file has the items using currentLine = fileReader.nextline()
// 2. pass the fileReader to the selection input.



}
