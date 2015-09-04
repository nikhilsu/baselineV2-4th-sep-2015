package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void shouldReturnTheNetAmountOfAnItemWhoseValueIs100AndIsNotTaxable(){
        boolean isTaxable = false;
        boolean isImported = false;
        int itemPrice = 100;
        Item item = new Item(itemPrice, isTaxable, isImported);
        Cashier cashier = new Cashier(item);

        assertEquals(100.0, cashier.itemNetAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheNetAmountOfAnItemWhoseValueIs100AndTaxable() {
        boolean isTaxable = true;
        boolean isImported = false;
        int itemPrice = 100;
        Item item = new Item(itemPrice, isTaxable, isImported);
        Cashier cashier = new Cashier(item);

        assertEquals(110.0, cashier.itemNetAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheCorrectNetAmountOfTheItemWhichIsNotTaxableButIsImported() {
        boolean isTaxable = false;
        boolean isImported = true;
        int itemPrice = 100;
        Item item = new Item(itemPrice, isTaxable, isImported);
        Cashier cashier = new Cashier(item);

        assertEquals(105.0, cashier.itemNetAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheCorrectNetAmountOfTheItemWhichIsTaxableAndIsImported() {
        boolean isTaxable = true;
        boolean isImported = true;
        int itemPrice = 100;
        Item item = new Item(itemPrice, isTaxable, isImported);
        Cashier cashier = new Cashier(item);

        assertEquals(115.0, cashier.itemNetAmount(), 0.0);
    }
}