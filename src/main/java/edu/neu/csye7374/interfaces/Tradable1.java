package edu.neu.csye7374.interfaces;

public interface Tradable1 extends Tradable {
    @Override
    default String getMetric() {
        // Default implementation for getting a metric
        return "Tradable1 default: Basic performance metric.";
    }
}
