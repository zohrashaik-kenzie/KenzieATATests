package com.kenzie.examples.week25.optionals;

import java.util.Optional;

public class OptionalIsPresent {
    public static void main(String[] args) {
        //isPresent() - returns true if value Present otherwise false
        /*----------------------------------------------------------*/
        Optional nonEmptyOptional = Optional.of("SEBD ATA Term 4");
        Optional emptyOptional = Optional.empty();

        System.out.println(emptyOptional.isPresent());  //false


        System.out.println(nonEmptyOptional.isPresent()); //true

        if(nonEmptyOptional.isPresent()){
            System.out.println(nonEmptyOptional.get());
        }
    }
}
