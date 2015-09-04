package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void shouldReturnTheNetAmountOfAnItemWhoseValueIs100AndIsNotTaxable(){
        Cashier cashier = new Cashier(100);

        assertEquals(100.0, cashier.itemNetAmount(), 0.0);
    }
}