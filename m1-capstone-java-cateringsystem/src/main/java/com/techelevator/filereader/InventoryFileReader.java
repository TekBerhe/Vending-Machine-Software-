package com.techelevator.filereader;

import com.techelevator.CateringSystem;
import com.techelevator.items.CateringItem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    This class should contain any and all details of access to the inventory file
 */
public class InventoryFileReader {

   // private String inventoryFileName;
    private List<CateringItem> listOfItems = new ArrayList<CateringItem>();
    //created a treeMap


//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<constructor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>     

    public InventoryFileReader(String inventoryFileName) throws FileNotFoundException {
        loadInventoryFile(inventoryFileName);
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<File Reader>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//    public List<String> getFileReader() {
//
//         File file = new File(inventoryFileName);/// (cateringsystem.csv)
//        try (Scanner fileScanner= new Scanner(inventoryFileName);) {
//            while(fileScanner.hasNextLine()){
//                String line = fileScanner.nextLine();
//                products.add(line);
//            }
//        }
//        return products;
//    }
}

