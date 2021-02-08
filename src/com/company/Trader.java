package com.company;

import java.util.Arrays;

public class Trader {
    private String name;
    Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public double addTrade(double price, int quantity) {
        try{
            double accountTrades = account.getTotalTrades();

            return (price * quantity) + accountTrades;
        } catch (NullPointerException nullPointerException) {
            System.err.println(nullPointerException.getMessage());
            System.err.println(Arrays.toString(nullPointerException.getStackTrace()));
        }
        return 0.00;
    }
}
