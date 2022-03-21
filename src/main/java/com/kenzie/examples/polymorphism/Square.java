package com.kenzie.examples.polymorphism;

public class Square extends Rectangle{

    public Square() {
        super();
    }

    @Override
    public void draw() {
        System.out.println("Square has been drawn");
    }

    public Square(double side) {
        super(side,side);
    }

}