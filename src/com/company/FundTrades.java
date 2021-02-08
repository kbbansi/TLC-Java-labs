package com.company;

public class FundTrades  extends Trade {
    public FundTrades(String ID, String symbol, int quantity, double price) {
        super(ID, symbol, quantity, price);
    }

    @Override
    public double calcDividend() {
        // setPrice(13000);
        return .10 * getPrice() + getPrice();
    }
}
