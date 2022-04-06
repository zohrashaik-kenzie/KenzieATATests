package com.kenzie.examples.week11.setterinjection;

public class ImprovedClassB  extends ClassB{

    @Override
    public double calculate() {
        return super.calculate()/100;
    }
}
