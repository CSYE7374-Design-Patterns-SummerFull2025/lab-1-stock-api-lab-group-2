package edu.neu.csye7374;

import edu.neu.csye7374.interfaces.Tradable;
import edu.neu.csye7374.models.Amazon;
import edu.neu.csye7374.models.Apple;
import edu.neu.csye7374.models.Google;
import edu.neu.csye7374.models.IBM;
import edu.neu.csye7374.models.Microsoft;
import edu.neu.csye7374.models.StockMarket;

public class Demo {

    public void runDemo() {

        Tradable ibmStock = new IBM();
        Tradable googleStock = new Google();
        Tradable appleStock = new Apple();
        Tradable microsoftStock = new Microsoft();
        Tradable amazonStock = new Amazon();

        StockMarket market = StockMarket.getInstance();

        System.out.println("\nAdding stocks to the market:");
        market.addStock(ibmStock);      
        market.addStock(appleStock);    
        market.addStock(googleStock);   
        market.addStock(microsoftStock); 
        market.addStock(amazonStock);   
        
        System.out.println("\nInitial Market State:");
        market.showMarketStocks();

        System.out.println("\nSimulating 6 Bids for Each Stock:");
        
        Tradable[] demoStocks = {ibmStock, appleStock, googleStock, microsoftStock, amazonStock};

        double[][] bidsForEachStock = {
            {135, 128, 129, 131, 140, 125},      
            {160, 148, 149, 152, 165, 145},      
            {2750, 2650, 2450, 2550, 2750, 2850}, 
            {325, 318, 315, 322, 330, 310},      
            {118, 114, 112, 116, 125, 110}
        };

        for (int stockIndex = 0; stockIndex < demoStocks.length; stockIndex++) {
            System.out.println("-------------------------------------------------------");
            Tradable stock = demoStocks[stockIndex];
            System.out.println("Bidding on: " + stock.getName());

            System.out.println("Initial state: " + stock.toString() + "\n");
            
            double[] currentStockBids = bidsForEachStock[stockIndex];

            for (int i = 0; i < 6; i++) {
                double bidValue = currentStockBids[i];
                market.tradeStock(stock.getName(), bidValue);
            }
            
            System.out.println("\nFinal state after bids: " + stock.toString());
            System.out.println("-------------------------------------------------------");
        }
        
        System.out.println("Final State of All Stocks on the Market: ");
        market.showMarketStocks();
	
        //Remove All Stocks from Market
        System.out.println("\nRemoving All Stocks from Market:");

        if (market.getStocks().isEmpty()) { 
            System.out.println("Market is already empty. No stocks to remove.");
        } else {
            for (Tradable stock : market.getStocks()) {
                market.removeStock(stock.getName());
            }
            System.out.println("All stocks removed. Current Market State:");
            market.showMarketStocks(); 
        }
    }
}
