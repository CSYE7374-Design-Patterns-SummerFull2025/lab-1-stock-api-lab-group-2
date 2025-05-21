package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;

public abstract class StockSuperClass implements Tradable {
    String name;
    double price;
    String description;

    // Constructor
    public StockSuperClass(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public StockSuperClass() {
        // Default constructor
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // setBid and getMetric remain abstract as per Tradable,
    // or could have default implementations if appropriate for Tradable0/1 logic
    // For now, assuming they are implemented by concrete stock classes like IBM

    @Override
    public String toString() {
        return "StockSuperClass{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", metric='" + getMetric() + '\'' + // Added metric to toString
                '}';
    }
}
