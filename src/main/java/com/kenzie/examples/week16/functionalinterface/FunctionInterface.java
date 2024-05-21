package com.kenzie.examples.week16.functionalinterface;

import com.google.common.base.Function;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FunctionInterface {

    public static void main(String[] args){
        Function<BigDecimal, String> priceEvaluator = price -> {
            if (price.compareTo(new BigDecimal(50)) == -1) {
                return "That's a great price!";
            } else if (price.compareTo(new BigDecimal(100)) == -1) {
                return "That's a fair price.";
            } else {
                return "That's too expensive!";
            }
        };

        Function<BigDecimal, String> nopriceEvaluator = price -> {
            if (price.compareTo(new BigDecimal(50)) == -1) {
                return "That's not a great price!";
            } else if (price.compareTo(new BigDecimal(100)) == -1) {
                return "That's not a fair price.";
            } else {
                return "That's not too expensive!";
            }
        };
        // A data structure we got somewhere else
        // Maps BigDecimal prices of items to a `String` such as "That's a great price!"
        // Data looks like this -
        // <.087 "That's a great price!">
        // <1.5 "That's a fair price">
        // <>.03 "That's a great price!">
        Map<BigDecimal, String> priceMap = new HashMap<>();
        // This is the price we're looking for in our map
        BigDecimal itemPrice = new BigDecimal("49.99");
        BigDecimal itemPrice2 = new BigDecimal("104.99");
        BigDecimal itemPrice3 = null;
        // computeIfAbsent tries to find the itemPrice in the map
        // If the value doesn't exist in the map, it will run the function on that price, and insert the result into the map
        priceMap.computeIfAbsent(itemPrice, priceEvaluator);
        priceMap.computeIfAbsent(itemPrice2, priceEvaluator);
        //priceMap.computeIfAbsent(itemPrice2, nopriceEvaluator);
        System.out.println(priceMap);
    }

}
