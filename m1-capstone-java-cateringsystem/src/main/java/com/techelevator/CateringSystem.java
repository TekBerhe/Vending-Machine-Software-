package com.techelevator;

import com.techelevator.filereader.InventoryFileReader;
import com.techelevator.items.CateringItem;
import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/*
    This class should encapsulate all the functionality of the Catering system, meaning it should
    contain all the "work"
 */
public class CateringSystem {

    private Menu menu;

    private double currentBalance;
    private List<Object> shoppingCart = new ArrayList<>();

    InventoryFileReader inventoryBuilder;
    public Map<String, CateringItem> inventory = new TreeMap<String, CateringItem>();

    public CateringSystem() {
        this.currentBalance = currentBalance;
    }

    //for each loop to look through map and if the map has product code then put that item in cart.

    public void addToCart(){
        for (String currentItem : inventory.keySet()){
            if (inventory.containsKey(menu.makeTheSelection())){
                shoppingCart.add(currentItem);
            }
        }
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void addMoney(double amountToAdd) {
        if (getCurrentBalance() + amountToAdd > 1500 || amountToAdd > 500) {
            System.out.println("INVALID ENTRY");
            //menu.invalidAmount();
        }
        if (getCurrentBalance() + amountToAdd <= 1500 && amountToAdd <= 500) {
            currentBalance += amountToAdd;
        }
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

