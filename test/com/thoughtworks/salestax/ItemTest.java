package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void shouldReturnTheNetAmountOfAnItemWhoseValueIs100AndIsNotTaxable(){
        boolean isTaxable = false;
        boolean isImported = false;
        Item item = new Item(100, isTaxable, isImported);

        assertEquals(100.0, item.itemNetAmount(), 0.0);
    }
}