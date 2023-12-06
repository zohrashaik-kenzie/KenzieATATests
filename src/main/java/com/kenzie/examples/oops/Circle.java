package com.kenzie.examples.oops;

public class Circle extends Shape{
    int radius;

    public Circle(String color, String name, String defintion, int r) {
        super(color, name, defintion);
        radius = r;
    }

    @Override
    public void calculateArea() {
        area = 3.14 * radius * radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * 3.14 * radius;
    }
}
