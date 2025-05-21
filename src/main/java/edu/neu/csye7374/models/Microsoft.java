package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;

public class Microsoft extends StockSuperClass implements Tradable {

    public Microsoft() {
        super();
        this.name = "MSFT";
        this.price = 330.0; // Example price
        this.description = "Microsoft Corporation is an American multinational technology corporation which produces computer software, consumer electronics, personal computers, and related services.";
    }

    public Microsoft(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        System.out.println("Bid placed for Microsoft (MSFT): " + bid + ". Current price: " + this.price);
        // this.setPrice(this.price * 1.0003);
    }

    @Override
    public String getMetric() {
        if (this.price > 320) {
            return "MSFT Metric: Buy - Strong cloud growth and enterprise adoption.";
        } else {
            return "MSFT Metric: Hold - Solid fundamentals.";
        }
    }
}
