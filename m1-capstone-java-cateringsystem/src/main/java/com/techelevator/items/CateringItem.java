package com.techelevator.items;

/*
    This represents a single catering item in the system
 */

public abstract class CateringItem {

    private String productCode;
    private String desciption;
    private double price;

    public CateringItem(String productCode, String desciption, double price){
        this.productCode = productCode;
        this.desciption = desciption;
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getDesciption() {
        return desciption;
    }

    public double getPrice() {
        return price;
    }

}
