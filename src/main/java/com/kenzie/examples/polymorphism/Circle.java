package com.kenzie.examples.polymorphism;

public class Circle implements ShapeInterface, ColorInterface {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 10;
    }

    @Override
    public void draw() {

        System.out.println("Circle has been drawn ");
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void fillColor() {
        System.out.println("Filled circle with color");
    }

    @Override
    public void draw(String color) {
        System.out.println("Drawing circle with color:" +color);
    }

    @Override
    public String toString() {
        return "I am a circle with radius =" + radius;
    }
}
