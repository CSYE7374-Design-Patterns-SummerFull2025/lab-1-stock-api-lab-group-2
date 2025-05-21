package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;

public class Apple extends StockSuperClass implements Tradable {

    public Apple() {
        super(); // Call to superclass default constructor
        this.name = "AAPL";
        this.price = 170.0;
        this.description = "Apple Inc. designs, manufactures, and markets smartphones, personal computers, tablets, wearables, and accessories worldwide.";
    }

    public Apple(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        // Example implementation for setting a bid for Apple stock
        System.out.println("Bid placed for Apple (AAPL): " + bid + ". Current price: " + this.price);
        this.setPrice(this.price * 1.001); 
    }

    @Override
    public String getMetric() {
        // Example implementation for getting a metric for Apple stock
        if (this.price > 150) {
            return "AAPL Metric: Strong Buy Signal";
        } else {
            return "AAPL Metric: Hold Signal";
        }
    }
}
