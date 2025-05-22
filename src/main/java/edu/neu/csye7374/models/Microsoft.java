package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;

public class Microsoft extends StockSuperClass implements Tradable {

    public Microsoft() {
        super();
        this.name = "MSFT";
        this.price = 330.0;
        this.description = "Microsoft: Software, cloud, gaming, devices.";
    }

    public Microsoft(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        System.out.println("Bid placed for Microsoft (MSFT): " + bid + ". Current price: " + this.price);
    }

    @Override
    public String getMetric() {
        if (this.price > 320) {
            return "Positive"; 
        } else {
            return "Negative"; 
        }
    }
}
