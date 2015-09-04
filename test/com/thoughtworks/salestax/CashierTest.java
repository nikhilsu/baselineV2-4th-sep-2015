package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void shouldReturnTheNetAmountOfAnItemWhoseValueIs100AndIsNotTaxable(){
        boolean isTaxable = false;
        boolean isImported = false;
        Cashier cashier = new Cashier(100, isTaxable, isImported);

        assertEquals(100.0, cashier.itemNetAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheNetAmountOfAnItemWhoseValueIs100AndTaxable() {
        boolean isTaxable = true;
        boolean isImported = false;
        Cashier cashier = new Cashier(100, isTaxable, isImported);

        assertEquals(110.0, cashier.itemNetAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheCorrectNetAmountOfTheItemWhichIsNotTaxableButIsImported() {

        boolean isTaxable = false;
        boolean isImported = true;
        Cashier cashier = new Cashier(100, isTaxable, isImported);

        assertEquals(105.0, cashier.itemNetAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheCorrectNetAmountOfTheItemWhichIsTaxableAndIsImported() {

        boolean isTaxable = true;
        boolean isImported = true;
        Cashier cashier = new Cashier(100, isTaxable, isImported);

        assertEquals(115.0, cashier.itemNetAmount(), 0.0);
    }
}