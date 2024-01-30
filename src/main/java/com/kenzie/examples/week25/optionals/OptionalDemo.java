package com.kenzie.examples.week25.optionals;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        /*
         * Optional.empty() returns an empty Optional.
         */
        Optional emptyOptional = Optional.empty();
        /*
         * Optional.of("something") returns non empty Optional.
         * it cannot be null - what happens if it is null?
         * how do we avoid that?
         */
        String name = getName();
        Optional nonEmptyOptional = Optional.ofNullable(name);
        System.out.println(nonEmptyOptional);
        /*
         * Optional.ofNullable("somevalue") returns non empty Optional.
         * If value is null, will get Optional.empty()
         */
        Optional nonEmptyOrEmptyOptional1 = Optional.ofNullable("Week 25");
        Optional nonEmptyOrEmptyOptional2 = Optional.ofNullable(null);

//        System.out.println(emptyOptional);
//        System.out.println(nonEmptyOptional);
//        System.out.println(nonEmptyOrEmptyOptional1);
//        System.out.println(nonEmptyOrEmptyOptional2);
    }

    private static String getName() {
        return "Zohra Shaik";
    }
}
