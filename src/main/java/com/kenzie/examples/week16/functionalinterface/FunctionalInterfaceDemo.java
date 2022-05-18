package com.kenzie.examples.week16.functionalinterface;

public class FunctionalInterfaceDemo {

    public static void main(String[] args){
        IFunctionalInterface lambda = () -> {
            System.out.println("Lambda Expression Executing...");
        };

        lambda.execute();

        FunctionalInterface fi = new FunctionalInterface();
        fi.execute();
    }
}
