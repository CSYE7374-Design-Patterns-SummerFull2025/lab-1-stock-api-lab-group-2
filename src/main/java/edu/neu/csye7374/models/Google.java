package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;

public class Google extends StockSuperClass implements Tradable {

    public Google() {
        super();
        this.name = "GOOGL";
        this.price = 2800.0; 
        this.description = "Google (Alphabet): Search, cloud, ads.";
    }

    public Google(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        System.out.println("Bid placed for Google (GOOGL): " + bid + ". Current price: " + this.price);
    }

    @Override
    public String getMetric() {
        if (this.price > 2700) {
            return "Positive";  
        }
        else {
            return "Negative";
        }
    }
}
