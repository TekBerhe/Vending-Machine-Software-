package com.techelevator.filereader;

import com.techelevator.CateringSystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    This class should contain any and all details of access to the inventory file
 */
public class InventoryFileReader {

    private String inventoryFileName;
    private String products;

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<constructor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     

    public InventoryFileReader(String inventoryFileName) {
        this.inventoryFileName = inventoryFileName;
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<File Reader>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public String getFileReader() {

        try (Scanner fileToRead = new Scanner(inventoryFileName);
             PrintWriter printWriter = new PrintWriter(String.valueOf(fileToRead))) {
            while(fileToRead.hasNextLine()){
                String products = fileToRead.nextLine();
                printWriter.println(products);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}

