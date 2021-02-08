package com.company;

public class BondTrades extends Trade {
    public BondTrades(String ID, String symbol, int quantity, double price){
        super(ID, symbol, quantity, price);
    }

    @Override
    public double calcDividend() {
        return 0.00;
    }
}
