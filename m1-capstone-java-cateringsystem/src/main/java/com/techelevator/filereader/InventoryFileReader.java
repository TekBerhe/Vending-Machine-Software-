package com.techelevator.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
    This class should contain any and all details of access to the inventory file
 */
public class InventoryFileReader {

    private String inventoryFileName;

    public InventoryFileReader(String inventoryFileName) {
        this.inventoryFileName = inventoryFileName;

        try {
            FileReader fileReader = new FileReader("cateringsystem.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
