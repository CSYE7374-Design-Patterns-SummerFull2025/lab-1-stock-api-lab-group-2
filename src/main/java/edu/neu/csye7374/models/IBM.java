package edu.neu.csye7374.models;

public class IBM extends StockSuperClass {
    public IBM() {
        super();
        this.name = "IBM";
        this.price = 140.0;
        this.description = "IBM: Technology and consulting."; 
    }

    public IBM(String name, double price, String description) {
        super(name, price, description);
    }
    
    @Override
    public void setBid(String bid) {
        System.out.println("Bid placed for IBM: " + bid + ". Current price: " + this.price);
    }

    @Override
    public String getMetric() {
        if (this.price > 130) {
            return "Positive";
        }
        else{
            return "Negative";
        }
    }
    
}
