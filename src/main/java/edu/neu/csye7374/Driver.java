package edu.neu.csye7374;

import edu.neu.csye7374.factories.AppleStockFactory;
import edu.neu.csye7374.factories.AppleStockLazySingletonFactory;
import edu.neu.csye7374.factories.IBMStockEagerSingletonFactory;
import edu.neu.csye7374.factories.IBMStockFactory;
import edu.neu.csye7374.factories.StockFactory;
import edu.neu.csye7374.interfaces.Tradable;
import edu.neu.csye7374.models.StockMarket;

/**
 * 
 * @author Yash Zaveri
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\\n\\n");

        System.out.println("Standard Factory Method Pattern: ");
        StockFactory ibmFactory = new IBMStockFactory();
        Tradable ibmStock1 = ibmFactory.createStock();
        System.out.println("Created stock: " + ibmStock1.toString());
        Tradable ibmStock2 = ibmFactory.createStock(); // Creates a new instance
        System.out.println("Created another stock: " + ibmStock2.toString());
        System.out.println("Are ibmStock1 and ibmStock2 the same instance? " + (ibmStock1 == ibmStock2));


        StockFactory appleFactory = new AppleStockFactory();
        Tradable appleStock1 = appleFactory.createStock();
        System.out.println("Created stock: " + appleStock1.toString());
        Tradable appleStock2 = appleFactory.createStock(); // Creates a new instance
        System.out.println("Created another stock: " + appleStock2.toString());
        System.out.println("Are appleStock1 and appleStock2 the same instance? " + (appleStock1 == appleStock2));
        System.out.println("----------------------------------------------------\\n");

        System.out.println("--- Demonstrating Eager Singleton Factory for IBM Stock ---");
        StockFactory ibmEagerSingletonFactory = IBMStockEagerSingletonFactory.getInstance();
        Tradable ibmSingletonStock1 = ibmEagerSingletonFactory.createStock();
        System.out.println("Created stock (Eager Singleton): " + ibmSingletonStock1.toString());
        Tradable ibmSingletonStock2 = ibmEagerSingletonFactory.createStock();
        System.out.println("Created stock again (Eager Singleton): " + ibmSingletonStock2.toString());
        System.out.println("Are ibmSingletonStock1 and ibmSingletonStock2 the same instance? " + (ibmSingletonStock1 == ibmSingletonStock2));
        
        // Verify factory instance is singleton
        StockFactory ibmEagerSingletonFactory2 = IBMStockEagerSingletonFactory.getInstance();
        System.out.println("Are ibmEagerSingletonFactory and ibmEagerSingletonFactory2 the same factory instance? " + (ibmEagerSingletonFactory == ibmEagerSingletonFactory2));
        System.out.println("--------------------------------------------------------\\n");


        System.out.println("--- Demonstrating Lazy Singleton Factory for Apple Stock ---");
        StockFactory appleLazySingletonFactory = AppleStockLazySingletonFactory.getInstance();
        Tradable appleSingletonStock1 = appleLazySingletonFactory.createStock();
        System.out.println("Created stock (Lazy Singleton): " + appleSingletonStock1.toString());
        Tradable appleSingletonStock2 = appleLazySingletonFactory.createStock();
        System.out.println("Created stock again (Lazy Singleton): " + appleSingletonStock2.toString());
        System.out.println("Are appleSingletonStock1 and appleSingletonStock2 the same instance? " + (appleSingletonStock1 == appleSingletonStock2));

        // Verify factory instance is singleton
        StockFactory appleLazySingletonFactory2 = AppleStockLazySingletonFactory.getInstance();
        System.out.println("Are appleLazySingletonFactory and appleLazySingletonFactory2 the same factory instance? " + (appleLazySingletonFactory == appleLazySingletonFactory2));
        System.out.println("-------------------------------------------------------\\n");

        System.out.println("--- Demonstrating StockMarket Singleton and Trading ---");
        StockMarket market = StockMarket.getInstance();

        // Add stocks created by various factories to the market
        market.addStock(ibmStock1); // From standard factory
        market.addStock(appleStock1); // From standard factory
        market.addStock(ibmSingletonStock1); // From eager singleton factory (this is the same IBM instance as ibmSingletonStock2)
        market.addStock(appleSingletonStock1); // From lazy singleton factory (this is the same Apple instance as appleSingletonStock2)

        market.showMarketStocks();

        System.out.println("\\nSimulating trades...");
        market.tradeStock("IBM", 145.0); // Trade the IBM stock (affects all references if it's a singleton)
        market.tradeStock("AAPL", 175.0); // Trade the Apple stock

        market.showMarketStocks();
		 
		System.out.println("\\n\\n============Main Execution End===================\\");
	}

}


