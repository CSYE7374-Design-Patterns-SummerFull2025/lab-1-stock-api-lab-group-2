package edu.neu.csye7374.factories;

import edu.neu.csye7374.interfaces.Tradable;
import edu.neu.csye7374.models.Apple;

// Lazy Singleton Factory for Apple Stock
public class AppleStockLazySingletonFactory extends StockFactory {
    private static volatile AppleStockLazySingletonFactory instance;
    private static volatile Tradable stockInstance; // Lazy initialized stock instance

    // Private constructor to prevent instantiation
    private AppleStockLazySingletonFactory() {}

    public static AppleStockLazySingletonFactory getInstance() {
        if (instance == null) {
            synchronized (AppleStockLazySingletonFactory.class) {
                if (instance == null) {
                    instance = new AppleStockLazySingletonFactory();
                }
            }
        }
        return instance;
    }

    @Override
    public Tradable createStock() {
        if (stockInstance == null) {
            synchronized (AppleStockLazySingletonFactory.class) {
                if (stockInstance == null) {
                    stockInstance = new Apple(); // Lazy initialization of the stock
                }
            }
        }
        return stockInstance;
    }
}
