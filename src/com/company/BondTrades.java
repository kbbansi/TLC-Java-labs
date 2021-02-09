package com.company;

public class BondTrades extends Trade {
    public BondTrades(String ID, String symbol, int quantity, double price){
        super(ID, symbol, quantity, price);
    }

    @Override
    public double calcDividend() {
        // calculation for bond dividends
        return (getPrice()/(getPrice() * getQuantity())) * 100;
    }
}
