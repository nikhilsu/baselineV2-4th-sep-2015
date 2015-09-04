package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void shouldReturnTheNetAmountOfAnItemWhoseValueIs100AndIsNotTaxable(){
        Cashier cashier = new Cashier(100, false);

        assertEquals(100.0, cashier.itemNetAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheNetAmountOfAnItemWhoseValueIs100AndTaxable() {
        Cashier cashier = new Cashier(100, true);

        assertEquals(110.0, cashier.itemNetAmount(), 0.0);
    }
}