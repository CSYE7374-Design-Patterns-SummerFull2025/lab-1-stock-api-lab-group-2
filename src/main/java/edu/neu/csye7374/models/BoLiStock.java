package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;

public class BoLiStock extends StockSuperClass implements Tradable {
    private double bid;

    public BoLiStock() {
        this.name = "BoLiTech";
        this.price = 100.0;
        this.description = "Bo Li's Tech Sector Stock";
    }

    @Override
    public void setBid(String bid) {
        this.bid = Double.parseDouble(bid);
        this.price += (this.bid - this.price) * 0.1;  // Custom logic
    }

    @Override
    public String getMetric() {
        double metric = (price - 100.0) * 1.5;
        return String.format("%.2f", metric);
    }
}
