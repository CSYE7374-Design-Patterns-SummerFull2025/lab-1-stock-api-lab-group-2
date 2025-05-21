package edu.neu.csye7374.factories;

import edu.neu.csye7374.interfaces.Tradable;
import edu.neu.csye7374.models.IBM;

public class IBMStockFactory extends StockFactory {
    @Override
    public Tradable createStock() {
        return new IBM();
    }
}
