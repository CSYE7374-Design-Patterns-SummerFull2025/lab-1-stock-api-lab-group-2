package edu.neu.csye7374.interfaces;

public interface Tradable0 extends Tradable {
    @Override
    default void setBid(String bid) {
        System.out.println("Tradable0 default: Bid set to " + bid);
        // Default implementation for setting a bid
    }

    @Override
    default String getMetric() {
        // Default implementation for getting a metric
        return "Tradable0 default: Neutral performance metric.";
    }
}
