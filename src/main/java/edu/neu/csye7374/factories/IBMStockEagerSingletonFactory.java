package edu.neu.csye7374.factories;

import edu.neu.csye7374.interfaces.Tradable;
import edu.neu.csye7374.models.IBM;

// Eager Singleton Factory for IBM Stock
public class IBMStockEagerSingletonFactory extends StockFactory {
    private static final IBMStockEagerSingletonFactory instance = new IBMStockEagerSingletonFactory();
    private static final Tradable stockInstance = new IBM(); // Eagerly create the stock instance

    // Private constructor to prevent instantiation
    private IBMStockEagerSingletonFactory() {}

    public static IBMStockEagerSingletonFactory getInstance() {
        return instance;
    }

    @Override
    public Tradable createStock() {
        // Return the pre-existing eagerly initialized stock instance
        return stockInstance;
    }
}
