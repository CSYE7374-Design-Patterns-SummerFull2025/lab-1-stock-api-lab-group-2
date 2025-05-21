package edu.neu.csye7374.models;
import edu.neu.csye7374.interfaces.Tradable;

public class IBM extends StockSuperClass implements Tradable {
    public IBM() {
        this.name = "IBM";
        this.price = 140.0;
        this.description = "IBM is a multinational technology and consulting company.";
    }
    
    @Override
    public void setBid(String bid) {
        // Implementation for setting a bid
        System.out.println("Bid placed for IBM: " + bid);
    }
    @Override
    public String getMetric() {
        // Implementation for getting a metric
        return "IBM Metric: Positive performance index.";
    }
    
}
