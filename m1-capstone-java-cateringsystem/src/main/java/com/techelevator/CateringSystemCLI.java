package com.techelevator;
import com.techelevator.filereader.InventoryFileReader;
import com.techelevator.items.CateringItem;
import com.techelevator.view.Menu;
import java.io.FileNotFoundException;
import java.util.*;


public class CateringSystemCLI {

	public static void main(String[] args) {
		Menu menu = new Menu();
		CateringSystemCLI cli = new CateringSystemCLI(menu);
		cli.run();
	}

	//	 * The menu class is instantiated in the main() method at the bottom of this file.
//	 * It is the only class instantiated in the starter code.
//	 * You will need to instantiate all other classes using the new keyword before you can use them.
//	 *
//	 * Remember every class and data structure is a data types and can be passed as arguments to methods or constructors.
	private Menu menu;
	private CateringSystem cateringSystem = new CateringSystem();
	private CateringItem cateringItem;

	public CateringSystemCLI(Menu menu) {
		this.menu = menu;
	}

	// Your application starts here
	public void run() {

		InventoryFileReader inventoryBuilder = null;
		boolean hasFileLocation = false;
		while (!hasFileLocation) {
			String inventoryPath = "cateringsystem.csv";
			try {
				inventoryBuilder = new InventoryFileReader(inventoryPath);
				hasFileLocation = true;
			} catch (FileNotFoundException e) {
				menu.displayError("File not found.");
			}
		}

		Map<String, CateringItem> inventory = inventoryBuilder.getInventory();
		List<Object> shoppingCart = new ArrayList<>();

		menu.showWelcomeMessage();

		menu.showSelectionMenu();

		while (true) {

			String selection = menu.makeTheSelection();

			if (Objects.equals(selection, "1")) {
				menu.showItemsForSale(inventory);
				System.out.println();
				menu.showSelectionMenu();
				continue;
			} else if (Objects.equals(selection, "2")) {
					menu.showSubMenu();
					while(true) {
						String selection2 = menu.makeTheSelection();
						if (Objects.equals(selection2, "1")) {
							cateringSystem.addMoney(menu.moneyToAdd());
							cateringSystem.getCurrentBalance();
							menu.showUpdatedSubMenu();
							System.out.println("Current Account Balance: $" + cateringSystem.getCurrentBalance());
							continue;
						} else if (Objects.equals(selection2, "2")) {
							while (true) {
								menu.showItemsForSale(inventory);
								menu.enterProductCode();
								String itemToAdd = menu.makeTheSelection();
								menu.enterQuantity();
								Integer quantityToAdd = menu.makeTheSelectionInteger();
								cateringSystem.addToCart();
								//SELECT PRODUCTS
							}
						} else {
							//COMPLETE TRANSACTION
						}
					}
				} else if (Objects.equals(selection, "3")) {
					menu.showQuit();
				}
				break;
			}
		}
	}






//		CateringItem Item = InventoryFileReader.
//
//		Map<String, CateringItem> Inventory =

		/*
			Display the Starting Menu and get the users choice.
			Remember all uses of System.out and System.in should be in the menu
			
			IF the User Choice is Display Vending Machine Items **(1) Display Catering Items**,
				THEN display vending machine items
			ELSE IF the User's Choice is Purchase **(2)Purchase**,
				THEN go to the purchase menu
			*/


//<<<<<<<<<<<<<<<	 * This starts the application, but ***YOU SHOULDN'T CHANGE THIS***  >>>>>>>>>>>>>>>>>>>>>>>>>



