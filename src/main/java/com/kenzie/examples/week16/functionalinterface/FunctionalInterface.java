package com.kenzie.examples.week16.functionalinterface;

public class FunctionalInterface implements IFunctionalInterface{
    @Override
    public void execute(int x) {
       System.out.println("Functional Interface is Executing");
    }
}
