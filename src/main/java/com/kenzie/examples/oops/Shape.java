package com.kenzie.examples.oops;

public  abstract class Shape {
    String color;
    String name;
    String defintion;
    double area;
    double perimeter;

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public Shape(String color, String name, String defintion) {
        this.color = color;
        this.name = name;
        this.defintion = defintion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefintion() {
        return defintion;
    }

    public void setDefintion(String defintion) {
        this.defintion = defintion;
    }

    public void printShape(){
        System.out.println("I am a shape");
    }

    public abstract void calculateArea();

    public abstract void calculatePerimeter();
}
