package com.Tests;

import com.company.Trade;
import org.junit.Assert;

import static org.junit.Assert.*;

public class TradeTest {

    @org.junit.Before
    public void setUp() throws Exception {
        Trade trade = new Trade("B1", "IBM", 20);
    }

    @org.junit.Test
    public void getID() {
    }

    @org.junit.Test
    public void setID() {
    }

    @org.junit.Test
    public void getSymbol() {
    }

    @org.junit.Test
    public void setSymbol() {
    }

    @org.junit.Test
    public void getQuantity() {
    }

    @org.junit.Test
    public void setQuantity() {
    }

    @org.junit.Test
    public void getPrice() {
    }

    @org.junit.Test
    public void setPrice() {
        double price =  0.00;
        Trade trade = new Trade("B1", "IBM", 20);
        // Assert.assertEquals(0.02, trade.setPrice(price), 0.001);
        Assert.assertTrue("No negatives accepted:", trade.setPrice(price) > 0 || trade.setPrice(price) == 0);
    }
}