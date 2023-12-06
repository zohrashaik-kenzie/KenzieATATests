package com.kenzie.examples.week16.functionalinterface;

import java.util.ArrayList;
import java.util.List;

public class FunctionExample {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(25);
        numberList.add(10);
        numberList.add(32);
        numberList.add(7);
        numberList.add(17);

        for (Integer value : numberList) {
            if (value == 7) {
                numberList.remove(value);
            }
        }

        System.out.println("Number list =" + numberList);

        //removeIf() iterates over each item in the list.
        //The value is the current item you're on.
        //The condition inside the curly brace value == 10 returns the true or false value.
       //If the condition returns true, removeIf() removes the item from the list.
        numberList.removeIf(value -> {
            return value == 10;
        });

        System.out.println("Number list =" + numberList);



    }
}
