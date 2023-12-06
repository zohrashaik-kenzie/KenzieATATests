package com.kenzie.examples.oops;

public class Triangle extends Shape{

    int base;
    int height;
    int side1, side2;

    public Triangle(String color, String name, String defintion) {
        super(color, name, defintion);
    }

    public void calculateArea() {
        area = 1/2 * base *height;
    }

    public void calculatePerimeter() {
        perimeter = base + side1 + side2;
    }
}
