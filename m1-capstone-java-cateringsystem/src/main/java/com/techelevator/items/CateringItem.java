package com.techelevator.items;

/*
    This represents a single catering item in the system
 */

public abstract class CateringItem {

    private String productCode;
    private String desciption;
    private double price;
    private int startingQuantity;

    public CateringItem(String productCode, String desciption, int startingQuantity, double price){
        this.productCode = productCode;
        this.desciption = desciption;
        this.price = price;
        this.startingQuantity = 25;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStartingQuantity() {
        return startingQuantity;
    }

    public void setStartingQuantity(int startingQuantity) {
        this.startingQuantity = startingQuantity;
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
