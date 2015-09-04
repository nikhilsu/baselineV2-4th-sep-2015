package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldReturnItsNetAmountWhenItsGrossValueIs100AndIsNotTaxable(){
        boolean isTaxable = false;
        boolean isImported = false;
        Item item = new Item(100, isTaxable, isImported);

        assertEquals(100.0, item.itemNetAmount(), 0.0);
    }

    @Test
    public void shouldReturnItsNetAmountWhenItsGrossValueIs100AndIsTaxable() {
        boolean isTaxable = true;
        boolean isImported = false;
        Item item = new Item(100, isTaxable, isImported);

        assertEquals(11 0.0, item.itemNetAmount(), 0.0);
    }
}