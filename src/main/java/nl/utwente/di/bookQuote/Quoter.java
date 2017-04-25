package nl.utwente.di.bookQuote;

import java.util.HashMap;

/**
 * Created by anne-greeth.vanherwijnen on 25/04/2017.
 */
public class Quoter {
    HashMap<String, Double> bookPrices = new HashMap<>();

    public Quoter(){
        bookPrices.put("1", 10.0);
        bookPrices.put("2", 45.0);
        bookPrices.put("3", 20.0);
        bookPrices.put("4", 35.0);
        bookPrices.put("5", 50.0);
    }

    public double getBookPrice(String string){
        return bookPrices.getOrDefault(string, 0.0);
    }
}
