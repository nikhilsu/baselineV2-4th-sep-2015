package com.thoughtworks.salestax;

import java.util.ArrayList;

//cashier takes in a list of items and returns its net amount

public class Cashier {
   private ArrayList<Item> listOfItems;

    public Cashier(ArrayList<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public double totalNetAmount() {
        double totalNetAmount = 0.0;
        for (Item item : listOfItems)
            totalNetAmount += item.itemNetAmount();
        return totalNetAmount;
    }
}
