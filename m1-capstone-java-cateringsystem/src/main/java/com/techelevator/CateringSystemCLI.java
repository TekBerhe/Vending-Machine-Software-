package com.techelevator;

import com.techelevator.filereader.InventoryFileReader;
import com.techelevator.view.Menu;

import java.util.Objects;
import java.util.Scanner;

/*
 * This class should control the workflow of the application, but not do any other work
 * 
 * The menu class should communicate with the user, but do no other work
 * 
 * This class should control the logical workflow of the application, but it should do no other
 * work.  It should communicate with the user (System.in and System.out) using the Menu class and ask
 * the ***CateringSystem.java*** class to do any work and pass the results between those 2 classes.
 */
public class CateringSystemCLI {


	/*
	 * The menu class is instantiated in the main() method at the bottom of this file.  
	 * It is the only class instantiated in the starter code.  
	 * You will need to instantiate all other classes using the new keyword before you can use them.
	 * 
	 * Remember every class and data structure is a data types and can be passed as arguments to methods or constructors.
	 */
	private Menu menu;

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<CONSTRUCTOR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	public CateringSystemCLI(Menu menu) {
		this.menu = menu;
	}

	/*
	 * Your application starts here
	 */

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<METHOD>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	public void run() {

		menu.showWelcomeMessage();

		menu.getInputFromUser();
		//System.out.println(menu.);n

		menu.itemDisplay();

//		boolean hasFileLocation = false;
//		while (hasFileLocation = true) {

//		menu.itemDisplay();



/*
		String userSelection = menu.getInputFromUser();
			if(Objects.equals(userSelection, "1")){
				menu.itemDisplay();
				menu.getInputFromUser();
			}
*/

			/*
			Display the Starting Menu and get the users choice.
			Remember all uses of System.out and System.in should be in the menu
			
			IF the User Choice is Display Vending Machine Items **(1) Display Catering Items**,
				THEN display vending machine items
			ELSE IF the User's Choice is Purchase **(2)Purchase**,
				THEN go to the purchase menu
			*/
		}


	/*
<<<<<<<<<<<<<<<	 * This starts the application, but ***YOU SHOULDN'T CHANGE THIS***  >>>>>>>>>>>>>>>>>>>>>>>>>
	 */
	public static void main(String[] args) {
		Menu menu = new Menu();
		CateringSystemCLI cli = new CateringSystemCLI(menu);
		cli.run();
	}
}
