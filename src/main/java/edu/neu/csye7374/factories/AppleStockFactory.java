package edu.neu.csye7374.factories;

import edu.neu.csye7374.interfaces.Tradable;
import edu.neu.csye7374.models.Apple;

public class AppleStockFactory extends StockFactory {
    @Override
    public Tradable createStock() {
        return new Apple();
    }
}
