package com.kenzie.examples.week25.optionals;

import java.util.Optional;

public class MapVsFlatMap {
    public static void main(String[] args){
        Optional<String> intStr = Optional.of("23");

        //map() method accepts a type T1 and transforms it into another type T2:
        Optional<Integer> intValue = intStr.map(Integer::parseInt);
        System.out.println("intValue = " + intValue);

//        //when map method returns a type optional
        Optional<Optional<Integer>> intValueMap = intStr.map(str -> Optional.of(Integer.parseInt(str))); //Optional[23]
        System.out.println("intValueMap = " + intValueMap);
//
//        //cleaner code using flatmap
        Optional<Integer> intValueFlatMap = intStr.flatMap(str -> Optional.of(Integer.parseInt(str)));
        System.out.println("intValueFlatMap =" + intValueFlatMap);
//
        //All it does here is to flatten out that extra wrapper, we don’t need.
    }
}
