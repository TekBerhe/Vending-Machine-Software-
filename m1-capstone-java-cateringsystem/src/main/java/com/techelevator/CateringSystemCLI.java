package com.techelevator;

import com.techelevator.filereader.InventoryFileReader;
import com.techelevator.items.CateringItem;
import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


public class CateringSystemCLI {

//	 * The menu class is instantiated in the main() method at the bottom of this file.
//	 * It is the only class instantiated in the starter code.
//	 * You will need to instantiate all other classes using the new keyword before you can use them.
//	 *
//	 * Remember every class and data structure is a data types and can be passed as arguments to methods or constructors.

	private Menu menu;

	public CateringSystemCLI(Menu menu) {
		this.menu = menu;
	}

	// Your application starts here

	public void run() {

		menu.showWelcomeMessage();

		InventoryFileReader inventoryBuilder = null;
				try {
					inventoryBuilder = new InventoryFileReader("cateringsystem.csv");

				} catch (FileNotFoundException e) {
					menu.displayError(" File not found");
				}
			}

		Map<String, CateringItem> inventory;

//		CateringItem selectedItem = menu.getInputFromUser();
//		if(Objects.equals(userSelection123, "1")){
//		}

//			//catches exception from inventoryFileReader
//			} catch (FileNotFoundException e) {
//				menu.displayError("File not found.");
//			}

		/*
			Display the Starting Menu and get the users choice.
			Remember all uses of System.out and System.in should be in the menu
			
			IF the User Choice is Display Vending Machine Items **(1) Display Catering Items**,
				THEN display vending machine items
			ELSE IF the User's Choice is Purchase **(2)Purchase**,
				THEN go to the purchase menu
			*/



//<<<<<<<<<<<<<<<	 * This starts the application, but ***YOU SHOULDN'T CHANGE THIS***  >>>>>>>>>>>>>>>>>>>>>>>>>

	public static void main(String[] args) {
		Menu menu = new Menu();
		CateringSystemCLI cli = new CateringSystemCLI(menu);
		cli.run();
	}
}
