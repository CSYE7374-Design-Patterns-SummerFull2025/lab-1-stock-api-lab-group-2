package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;

public class Amazon extends StockSuperClass implements Tradable {

    public Amazon() {
        super();
        this.name = "AMZN";
        this.price = 120.0; // Example price post-split
        this.description = "Amazon.com, Inc. is an American multinational technology company focusing on e-commerce, cloud computing, online advertising, digital streaming, and artificial intelligence.";
    }

    public Amazon(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        System.out.println("Bid placed for Amazon (AMZN): " + bid + ". Current price: " + this.price);
        // this.setPrice(this.price * 1.0004);
    }

    @Override
    public String getMetric() {
        if (this.price > 115) {
            return "AMZN Metric: Accumulate - Strong e-commerce and AWS segments.";
        } else {
            return "AMZN Metric: Hold - Diversified business model.";
        }
    }
}
