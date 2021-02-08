package com.company;

public class Trade {
    private String ID;
    private String Symbol;
    private int Quantity;
    private double price;

    // constructor
    public Trade(String ID, String symbol, int quantity, double price) {
        this.ID = ID;
        Symbol = symbol;
        Quantity = quantity;
        this.price = price;
    }

    // constructor without price
    public Trade(String ID, String symbol, int quantity) {
        this.ID = ID;
        Symbol = symbol;
        Quantity = quantity;
    }

   // public Trade() {}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        if ( price < 0 ){
            System.out.println("Price Cannot be a negative value");
        } else {
            this.price = price;
        }
        return price;
    }

    //Override toString method
    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + ID + '\'' +
                ", Symbol='" + Symbol + '\'' +
                ", Quantity=" + Quantity +
                ", price=" + price +
                '}';
    }
}
