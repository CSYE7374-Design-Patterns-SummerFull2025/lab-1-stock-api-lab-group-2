package edu.neu.csye7374;

import edu.neu.csye7374.models.BoLiStock;

/**
 * 
 * @author Yash Zaveri
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

         //Add your code in between these two print statements


		// START: BoLi's test code
        BoLiStock myStock = new BoLiStock();
        String[] bids = {"105", "98", "110", "108", "95", "102"};

        for (String bid : bids) {
            myStock.setBid(bid);
            System.out.println(myStock);  // toString() prints name, price, description, etc.
        }

		
        // END: BoLi's test code
		 
		System.out.println("\n\n============Main Execution End===================");

	}

}


