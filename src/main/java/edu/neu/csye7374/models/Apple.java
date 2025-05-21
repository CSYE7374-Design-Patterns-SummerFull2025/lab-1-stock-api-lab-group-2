package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;

public class Apple extends StockSuperClass implements Tradable {

    public Apple() {
        super(); 
        this.name = "AAPL";
        this.price = 170.0;
        this.description = "Apple: Consumer electronics, software, online services.";
    }

    public Apple(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        System.out.println("Bid placed for Apple (AAPL): " + bid + ". Current price: " + this.price);
    }

    @Override
    public String getMetric() {
        if (this.price > 150) {
            return "Positive";
        } else {
            return "Negative";
        }
    }
}
