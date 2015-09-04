package com.thoughtworks.salestax;
//cashier takes in an item and returns its net amount
public class Cashier {
    private double itemPrice;
    private boolean isTaxable;
    private boolean isImported;

    public Cashier(double itemPrice, boolean isTaxable, boolean isImported) {
        this.itemPrice = itemPrice;
        this.isTaxable = isTaxable;
        this.isImported = isImported;
    }

    public double itemNetAmount() {
        double tax = 0.0;
        if (isTaxable == true)
            tax += 10;
        if (isImported == true)
            tax += 5;
        double taxOnItem = (itemPrice * tax)/100 ;
        return this.itemPrice +taxOnItem;
    }
}
