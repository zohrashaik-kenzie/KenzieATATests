package com.kenzie.examples.oops;

public class OopsDemo {

    public static void main(String[] args){

      //  Rectangle rectangle = new Rectangle();
//        rectangle.setColor("Red");
//        rectangle.setName("Rectangle");
//        rectangle.setDefintion("A parallelogram with right-angles");
//
//        Calculator calculator  = new Calculator(10,20, '+');
//        calculator.calculate();
//        System.out.println(calculator.getResult());
//
//        Rectangle rectangle = new Rectangle("Red", "Rectangle1","This is a red rectangle",10,20);
//        Square square = new Square("Yellow", "Square1","This is a yellow square",15);
//
//        rectangle.calculateArea();
//        System.out.println("Area of rectangle = " + rectangle.getArea());
//
//        square.calculateArea();
//        System.out.println("Area of square = " +  square.getArea());

        Shape rectangle2 = new Rectangle2("Red", "Shape1","This is a red Shape1",12,13);
        Shape square = new Square("Yellow", "Shape2","This is a yellow Shape2",20);

        rectangle2.calculateArea();
        System.out.println("Area of shape1 = " + square.getArea());

        square.calculateArea();
        System.out.println("Area of shape2 = " + square.getArea());

        Shape shape3 = new Circle("Pink","Shape 3", "I am a circle",5);
        shape3.calculateArea();
        System.out.println("Area of shape3 = " + shape3.getArea());

        rectangle2.printShape();
        square.printShape();
    }
}
