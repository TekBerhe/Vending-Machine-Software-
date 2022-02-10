package com.techelevator.filereader;

import com.techelevator.CateringSystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    This class should contain any and all details of access to the inventory file
 */
public class InventoryFileReader extends CateringSystem {

    private String inventoryFileName;

    public InventoryFileReader(String inventoryFileName) {
        this.inventoryFileName = inventoryFileName;

        try (Scanner fileToRead = new Scanner("cateringsystem.csv");
             PrintWriter printWriter = new PrintWriter(String.valueOf(fileToRead)))
        {
            while(fileToRead.hasNextLine()){
                String currentLine = fileToRead.nextLine();
                printWriter.println(currentLine);
                {
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
