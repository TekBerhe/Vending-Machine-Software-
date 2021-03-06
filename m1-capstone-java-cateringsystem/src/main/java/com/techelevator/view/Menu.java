package com.techelevator.view;

import com.techelevator.CateringSystem;
import com.techelevator.CateringSystemCLI;
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
	public CateringSystem cateringSystem = new CateringSystem();
	public Menu(){}
	private CateringSystemCLI cli;

	public void showWelcomeMessage() {
		System.out.println("*************************");
		System.out.println("**     Weyland Corp.   **");
		System.out.println("**      Catering       **");
		System.out.println("*************************");
	}

	public String getInputFromUser(String filepath){
		System.out.println("Please enter a file path");
		return in.nextLine();
	}

	public void showSelectionMenu(){
		System.out.println("(1) Display Catering Item");
		System.out.println("(2) Order");
		System.out.println("(3) Quit");
		System.out.println();
		System.out.println("Please make a selection...");
	}

	public String makeTheSelection(){
		return in.nextLine();
	}

	public int makeTheSelectionInteger(){
		return Integer.parseInt(in.nextLine());
	}

	public String makeSecondSelection(){
		return in.nextLine();
	}



	public void showItemsForSale(Map<String, CateringItem> inventory){
		String productCode = "Product Code";
		String description = "Description";
		String qty = "Qty";
		String price = "Price";
		System.out.printf("%-18s %-25s %-10s %-10s %n", productCode, description, qty, price);
		System.out.println();

		for ( Map.Entry<String, CateringItem> mapEntry : inventory.entrySet()) {


			System.out.printf( "%-18s %-25s %-10s %-15s %n", mapEntry.getValue().getProductCode(), mapEntry.getValue().getDesciption(), mapEntry.getValue().getStartingQuantity(), mapEntry.getValue().getPrice());
		}
	}

	public void showSubMenu(){
		System.out.println("(1) Add Money");
		System.out.println("(2) Select Products");
		System.out.println("(3) Complete Transaction");
		System.out.println("Current Account Balance: $" + cateringSystem.getCurrentBalance());
		System.out.println("");
		System.out.println("What would you like to do?");
	}

	public void showUpdatedSubMenu(){
		System.out.println("(1) Add Money");
		System.out.println("(2) Select Products");
		System.out.println("(3) Complete Transaction");
		System.out.println("");
		System.out.println("What would you like to do?");
	}

	public double moneyToAdd(){
		System.out.println("How much money would you like to add?");
		 return Double.parseDouble(in.nextLine());
	}

	public void displayError(String message) {
		System.out.println("***** ERROR *****");
		System.out.println(message);
	}

	public void enterProductCode(){
		System.out.println("");
		System.out.println("Please Enter a Product Code...");
	}

	public void enterQuantity(){
		System.out.println("Please Enter Amount to Purchase...");
	}

	public void invalidAmount(String message) {
		System.out.println("***** ERROR *****");
		System.out.println("Invalid Amount Entered");
		System.out.println("Must Add Less Than $500 At Once");
		System.out.println("Total Balance Cannot Exceed $1500");
	}

	public void showQuit(){
		System.out.println("THANKS FOR CHOOSING SPAGHETTI CODE");
	}



// 1. we need to make sure the file has the items using currentLine = fileReader.nextline()
// 2. pass the fileReader to the selection input.



}
