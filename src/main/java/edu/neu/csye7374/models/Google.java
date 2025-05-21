package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;

public class Google extends StockSuperClass implements Tradable {

    public Google() {
        super(); // Call to superclass default constructor
        this.name = "GOOGL";
        this.price = 2800.0; // Example price
        this.description = "Alphabet Inc. (Google) is an American multinational technology conglomerate holding company.";
    }

    public Google(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        // Example implementation for setting a bid for Google stock
        System.out.println("Bid placed for Google (GOOGL): " + bid + ". Current price: " + this.price);
        // Example: A bid might slightly increase the perceived value or trigger a price check
        // this.setPrice(this.price * 1.0002); 
    }

    @Override
    public String getMetric() {
        // Example implementation for getting a metric for Google stock
        if (this.price > 2700) {
            return "GOOGL Metric: Strong Growth Potential - Market leader in search and cloud.";
        } else if (this.price > 2500) {
            return "GOOGL Metric: Stable - Consistent performer.";
        } else {
            return "GOOGL Metric: Monitor - Watch for market changes.";
        }
    }
}
