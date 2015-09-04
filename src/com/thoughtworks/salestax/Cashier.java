package com.thoughtworks.salestax;
//cashier takes in an item and returns its net amount
public class Cashier {
   private Item item;

    public Cashier(Item item) {
        this.item = item;
    }

    public double itemNetAmount() {
        return item.itemNetAmount();
    }
}
