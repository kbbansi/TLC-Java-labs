package com.Tests;

import com.company.FundTrades;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FundTradesTest {

    @Test
    public void calcDividend() {
        FundTrades fundTrades = new FundTrades("B16", "FANMILK", 13, 15.00);

        // fundTrades.getPrice();
        Assert.assertEquals(16.5, fundTrades.calcDividend(), 0.001);
    }
}