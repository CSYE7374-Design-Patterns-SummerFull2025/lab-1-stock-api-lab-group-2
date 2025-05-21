package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;

public class Amazon extends StockSuperClass implements Tradable {

    public Amazon() {
        super();
        this.name = "AMZN";
        this.price = 120.0; 
        this.description = "Amazon: E-commerce, Cloud, AI.";
    }

    public Amazon(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        System.out.println("Bid placed for Amazon (AMZN): " + bid + ". Current price: " + this.price);
    }

    @Override
    public String getMetric() {
        if (this.price > 130) {
            return "Positive"; 
        } else {
            return "Negative"; 
        }
    }
}
