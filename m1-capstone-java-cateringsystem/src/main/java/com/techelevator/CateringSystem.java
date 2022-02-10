package com.techelevator;

import com.techelevator.filereader.InventoryFileReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
    This class should encapsulate all the functionality of the Catering system, meaning it should
    contain all the "work"
 */
public class CateringSystem {

    InventoryFileReader fileReader;
    List<String> inventoryList;

    public CateringSystem(){
        fileReader = new InventoryFileReader("test String");
        inventoryList = fileReader.getFileReader();
    };

//    public InventoryFileReader()
//does this need to be in Menu class or CateringSystem class?

//
//    public String displayCateringItems(){
//        return testFileReader.getFileReader();
//    }

}
