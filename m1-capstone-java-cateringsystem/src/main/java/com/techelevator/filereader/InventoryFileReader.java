package com.techelevator.filereader;

import com.techelevator.CateringSystem;
import com.techelevator.items.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
    This class should contain any and all details of access to the inventory file
 */
public class InventoryFileReader {

    private String inventoryFileName;
    public Map<String, CateringItem> inventory = new HashMap<String, CateringItem>();

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<constructor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     

    public InventoryFileReader(String inventoryFileName) {
        this.inventoryFileName = inventoryFileName;
    }

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<File Reader>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //Method to get inventory as a map

    public Map<String, CateringItem> getInventory() {
        return this.inventory;
    }

    //File is read and an item is built from current line read, then the item is added to our map of inventory
    //has try/catch statement

    private void loadInventoryFromFile() throws FileNotFoundException {
        File file = new File(inventoryFileName);
        try (Scanner fileScanner = new Scanner(file);) {
            while (fileScanner.hasNextLine()) {
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

