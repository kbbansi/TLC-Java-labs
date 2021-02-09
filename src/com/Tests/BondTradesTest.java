package com.Tests;

import com.company.BondTrades;
import com.company.FundTrades;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BondTradesTest {

    @Test
    public void calcDividend() {
        BondTrades bondTrades = new BondTrades("B17", "BB-M", 500, 15.25);
        Assert.assertEquals("Testing", 0.2, bondTrades.calcDividend(), 0.001);
    }
}