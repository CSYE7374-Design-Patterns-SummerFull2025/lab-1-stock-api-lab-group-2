package edu.neu.csye7374.models;

import edu.neu.csye7374.interfaces.Tradable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class StockMarket {
    private static StockMarket instance;
    private List<Tradable> stocks;

    private StockMarket() {
        stocks = new ArrayList<>();
    }

    public static synchronized StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }
        return instance;
    }

    public void addStock(Tradable stock) {
        if (stock != null) {
            stocks.add(stock);
            System.out.println(stock.getName() + " added to the market.");
        }
    }

    public void removeStock(String stockName) {
        Iterator<Tradable> iterator = stocks.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Tradable stock = iterator.next();
            if (stock.getName().equalsIgnoreCase(stockName)) {
                iterator.remove();
                System.out.println(stockName + " removed from the market.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Stock " + stockName + " not found in the market.");
        }
    }

    public void tradeStock(String stockName, double bid) {
        Tradable stockToTrade = null;
        for (Tradable stock : stocks) {
            if (stock.getName().equalsIgnoreCase(stockName)) {
                stockToTrade = stock;
                break;
            }
        }

        if (stockToTrade != null) {
            System.out.println("Trading " + stockName + " with bid: " + bid);
            
            double currentPrice = stockToTrade.getPrice();
            String metric = stockToTrade.getMetric();
            
            // Call Price calculation logic
            double newPrice = calculateNewPriceLogic(currentPrice, bid, metric, stockToTrade.getName());
            stockToTrade.setPrice(newPrice);
            
            // Set the bid on the stock
            stockToTrade.setBid(String.valueOf(bid)); 

            System.out.println("New state of " + stockName + " (after trade): " + stockToTrade.toString());
        } else {
            System.out.println("Stock " + stockName + " not found for trading.");
        }
    }

    // Stock trading logic
    private double calculateNewPriceLogic(double currentPrice, double bid, String metric, String stockName) {
        System.out.println("Calculating new price for " + stockName + ": current=" + currentPrice + ", bid=" + bid + ", metric=" + metric);
        double newPrice = currentPrice;

        if (bid > currentPrice) {
            newPrice = bid;
        }

        // Adjust price based on metric (example)
        if (metric != null && metric.toLowerCase().contains("positive")) {
            newPrice *= 1.02; // Increase price by 2% for positive metric
        } else if (metric != null && metric.toLowerCase().contains("negative")) {
            newPrice *= 0.98; // Decrease price by 2% for negative metric
        }

        if (newPrice < 0) {
            newPrice = 0.01; // Minimum price
        }

        System.out.println("Calculated new price for " + stockName + ": " + newPrice);
        return newPrice;
    }

    public void showMarketStocks() {
        if (stocks.isEmpty()) {
            System.out.println("Stock market is empty.");
            return;
        }
        System.out.println("\n--- Stocks on the Market ---");
        for (Tradable stock : stocks) {
            System.out.println(stock.toString()); 
        }
        System.out.println("----------------------------\n");
    }
}
