package edu.neu.csye7374.factories;

import edu.neu.csye7374.interfaces.Tradable;

public abstract class StockFactory {
    // Factory Method
    public abstract Tradable createStock();
}
