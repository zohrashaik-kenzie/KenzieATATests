package com.kenzie.examples.oops;

public abstract class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(String color, String name, String defintion, int x, int y) {
        super(color, name, defintion);
        width = x;
        height = y;
    }

    public void calculateArea() {
        area = width * height;
    }

//    public void calculatePerimeter() {
//        perimeter = 2 * (width + height);
//    }
}
