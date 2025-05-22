package edu.neu.csye7374.interfaces;

public interface Tradable {
    String getName();
    double getPrice(); 
    void setPrice(double price); 
    String getDescription(); 

    /**
     * place a bid to buy a stock
     * 
     * @param bid
     */
    void setBid(String bid);
    /**
     * return a metric indicating measure of positive performance of this stock
     * where a large positive index means consider buying this well performing stock.
     * and where a large negative index means consider selling this poorly performing stock.
     * @return
     */
    String getMetric();

}
