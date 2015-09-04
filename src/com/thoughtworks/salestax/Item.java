package com.thoughtworks.salestax;

// Item has Gross price, knows whether it is taxable or imported and returns its net Amount
public class Item {
    private double itemPrice;
    private boolean isTaxable;
    private boolean isImported;

    public Item(double itemPrice, boolean isTaxable, boolean isImported) {
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
