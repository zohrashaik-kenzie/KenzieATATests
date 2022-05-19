package com.kenzie.examples.week16.functionalinterface;


public class FunctionalInterfaceDemo {

    public static void main(String[] args){
        IFunctionalInterface lambda = (x) -> {
              System.out.println("Lambda Expression Executing...:" + x);
        };

        lambda.execute(10);
        lambda.print("This is a test");

        FunctionalInterface fi = new FunctionalInterface();

        fi.execute(20);
    }
}
