package com.kenzie.examples.week16.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckIfSeven implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
      return integer == 7;
    }

    public static void main(String[] args){
        List<Integer> numberList = new ArrayList<>();
        numberList.add(25);
        numberList.add(10);
        numberList.add(32);
        numberList.add(7);
        numberList.add(17);

        Predicate<Integer> checkIfSeven = new CheckIfSeven();
        numberList.removeIf(checkIfSeven);

        System.out.println("Number List = " + numberList);
    }

}
