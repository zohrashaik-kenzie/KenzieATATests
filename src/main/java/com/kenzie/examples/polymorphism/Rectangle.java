package com.kenzie.examples.polymorphism;

public class Rectangle extends Shape implements ShapeInterface, ColorInterface
{
    public Rectangle(double width, double height) {
        super();
        setValues(width, height);
    }

    public Rectangle() {

    }

    //Calculate and return area of rectangle
    public double getArea()
    {
        return getHeight() * getWidth();
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double perimeter() {
        return (double) 2 * (getHeight() * getWidth());
    }

    @Override
    public void move() {
        System.out.println("The Rectangle is moving");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "I am a rectangle with width:" + getWidth() + ", heigh:" + getHeight() +
                ", area " + getArea() + ", perimeter: " + perimeter();
    }

    public void move(int a){
        System.out.println("Moving by : " + a + " steps forward");
    }

    public void move(int a, int b ){
        System.out.println("Moving by : " + a + " steps forward");
        System.out.println("Moving by : " + b + " steps backward");
    }

    @Override
    public void fillColor() {
        System.out.println("I am filling the rectangle with color");
    }

    @Override
    public void draw(String color) {

    }


}