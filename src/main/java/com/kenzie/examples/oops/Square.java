package com.kenzie.examples.oops;

public class Square extends Shape {

    int side;

    public Square(String color, String name, String defintion, int s) {
        super(color, name, defintion);
        side = s;
    }

    public void calculateArea() {
        area = side * side;
    }

    public void calculatePerimeter() {
        perimeter = 4 * side;
    }

    @Override
    public void printShape() {
        System.out.println("I am a square");
    }
}
