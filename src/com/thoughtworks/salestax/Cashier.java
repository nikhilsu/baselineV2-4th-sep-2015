package com.thoughtworks.salestax;
//cashier takes in an item and returns its net amount
public class Cashier {
    private double itemPrice;
    private boolean isTaxable;

    public Cashier(double itemPrice, boolean isTaxable) {
        this.itemPrice = itemPrice;
        this.isTaxable = isTaxable;
    }

    public double itemNetAmount() {
        if (this.isTaxable == true) {
            double taxOnItem = (itemPrice * 10)/100 ;
            return this.itemPrice +taxOnItem;
        }
        else
            return this.itemPrice;
    }
}
