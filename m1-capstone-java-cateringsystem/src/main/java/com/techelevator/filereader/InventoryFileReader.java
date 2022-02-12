package com.techelevator.filereader;

import com.techelevator.CateringSystem;

import com.techelevator.items.*;

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

/*
    This class should contain any and all details of access to the inventory file
 */
public class InventoryFileReader {

    private String inventoryFileName;
    public Map<String, CateringItem> inventory = new TreeMap<String, CateringItem>();

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<constructor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     

    public InventoryFileReader(String inventoryFileName) throws FileNotFoundException {
        this.inventoryFileName =inventoryFileName;
        loadInventoryFromFile();
    }

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<File Reader>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //Method to get inventory as a map

    public Map<String, CateringItem> getInventory() {
        return this.inventory;
    }

    //File is read and an item is built from current line read, then the item is added to our map of inventory
    //has try/catch statement

    private void loadInventoryFromFile() throws FileNotFoundException {
        //File is instantiated and given the value of the text file passed into the constructor (cateringsystem.csv)
        File file = new File(inventoryFileName);
        //file scanner is instantiated and we pass it the file (cateringsystem.csv)
        try (Scanner fileScanner = new Scanner(file);) {
            //while loop checks for next line (stops if no next line)
            while (fileScanner.hasNextLine()) {
                //a String named line is instantiated and assigned the value at the next line in (cateringsystem.txt)
                String line = fileScanner.nextLine();

                CateringItem newItem = buildItemFromLine(line);
                inventory.put(newItem.getProductCode(), newItem);
            }
        }
    }

    private CateringItem buildItemFromLine(String line) {
        CateringItem newItem = null;
        String[] parts = line.split("\\|");

        String category = parts[0];
        String productCode = parts[1];
        String description = parts[2];
        double price = Double.parseDouble(parts[3]);

        if (category.equalsIgnoreCase("A")) {
            newItem = new Appetizer(productCode, description, price);
        } else if (category.equalsIgnoreCase("B")) {
            newItem = new Beverage(productCode, description, price);
        } else if (category.equalsIgnoreCase("D")) {
            newItem = new Desert(productCode, description, price);
        } else if (category.equalsIgnoreCase("E")) {
            newItem = new Entree(productCode, description, price);
        }
        return newItem;
    }
}

