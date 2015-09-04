package com.thoughtworks.salestax;
//cashier takes in an item and returns its net amount
public class Cashier {
    private double itemPrice;

    public Cashier(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double itemNetAmount() {
        return this.itemPrice;
    }
}
