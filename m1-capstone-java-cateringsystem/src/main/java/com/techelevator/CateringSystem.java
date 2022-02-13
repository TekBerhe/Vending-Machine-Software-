package com.techelevator;

import com.techelevator.filereader.InventoryFileReader;
import com.techelevator.items.CateringItem;
import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    This class should encapsulate all the functionality of the Catering system, meaning it should
    contain all the "work"
 */
public class CateringSystem {

    private Menu menu;

    private double currentBalance = 0;
    private Map<String, Double> shoppingCart= new HashMap<>();

    public CateringSystem(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double addMoney(double amountToAdd) {
        if (currentBalance + amountToAdd <= 1500) {
            if (amountToAdd < 500) {
                currentBalance = amountToAdd + currentBalance;
            }
        } else {
            menu.invalidAmount("Invalid Amount Entered");
            menu.invalidAmount("Must Add Less Than $500 At Once");
            menu.invalidAmount("Total Balance Cannot Exceed $1500");
        }
        return currentBalance;
    }

}
/*
    so when the customer selects 2
     -- the menu class will show them the 3 options ---
    ******** if they select 1
     ask the customer how much money they would like to add?
     so we need to create a method called addMoney that return int called current balance
     in the menu class.
     then have an if statement saying
     double currentBalance = 0;
     if(CurrentBalance <= 1500) { this allows to add money because its less than 1500
       if(addedmoney < 500 ) { this allows to
    currentBalance = currentBalance + addMoney;
    }
    return currentBalance;
   else {
   return "you balance is overLimit"
   }


   if select 2)
   we'll display the menu again
   and ask which product they would like to select
   int shoppingCart = 0;
   if( product selected .equals.inventory.getproductCode) {
   shoppingCart++;
   currentBalance = currentBalance - inventory.getproductCode.getprice;
   menu.sub-menu;
   if select 3)

 */

