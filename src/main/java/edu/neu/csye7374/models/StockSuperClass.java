package edu.neu.csye7374.models;

public abstract class StockSuperClass{
    String name;
    double price;
    String description;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
