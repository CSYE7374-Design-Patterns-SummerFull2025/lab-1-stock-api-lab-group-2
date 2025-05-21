package edu.neu.csye7374.models;

public class IBM extends StockSuperClass {
    public IBM() {
        super(); // Call to superclass default constructor
        this.name = "IBM";
        this.price = 140.0;
        this.description = "IBM is a multinational technology and consulting company.";
    }

    public IBM(String name, double price, String description) {
        super(name, price, description);
    }
    
    @Override
    public void setBid(String bid) {
        // Implementation for setting a bid
        System.out.println("Bid placed for IBM: " + bid + ". Current price: " + this.price);
        this.setPrice(this.price * 1.0005);
    }

    @Override
    public String getMetric() {
        // Implementation for getting a metric
        if (this.price > 130) {
            return "IBM Metric: Positive performance index.";
        }
        return "IBM Metric: Neutral performance index.";
    }
    
}
