package com.techelevator.filereader;

import com.techelevator.CateringSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/*
    This class should contain any and all details of access to the inventory file
 */
public class InventoryFileReader {

    private String inventoryFileName;
    private List<String> products;

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<constructor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     

    public InventoryFileReader(String inventoryFileName) {
        this.inventoryFileName = inventoryFileName;
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<File Reader>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public List<String> getFileReader() {

         File file = new File(inventoryFileName);
        try (Scanner fileScanner= new Scanner(inventoryFileName);) {
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                products.add(line);
            }
        }
        return products;
    }
}

