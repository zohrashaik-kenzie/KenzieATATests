package com.kenzie.examples.week16.function;

import java.math.BigDecimal;
import java.util.function.Function;

public class PriceEvaluator implements Function<BigDecimal, String> {
    @Override
    public String apply(BigDecimal price) {
        if (price.compareTo(new BigDecimal(50)) < 0) {
            return "That's a great price!";
        } else if (price.compareTo(new BigDecimal(100)) < 0) {
            return "That's a fair price.";
        } else {
            return "That's too expensive!";
        }
    }



    public static void main(String[] args){
        //PriceEvaluator priceEvaluator = new PriceEvaluator();
        //String response = priceEvaluator.apply(new BigDecimal(5));
        // We don't declare a type on price. We get juicy type inference for free
        Function<BigDecimal, String> priceEvaluator = price -> {
            if (price.compareTo(new BigDecimal(50)) == -1) {
                return "That's a great price!";
            } else if (price.compareTo(new BigDecimal(100)) == -1) {
                return "That's a fair price.";
            } else {
                return "That's too expensive!";
            }
        };
       String response = priceEvaluator.apply(new BigDecimal(5));
    }
}