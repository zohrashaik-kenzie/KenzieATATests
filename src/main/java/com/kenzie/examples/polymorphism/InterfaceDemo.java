package com.kenzie.examples.polymorphism;

import java.util.ArrayList;

public class InterfaceDemo {

        // Main driver method
        public static void main(String[] args)
        {
            // Creating the Object of Rectangle class
            // and using shape interface reference.
//            ShapeInterface rect = new Rectangle(2.0, 3.0);
//
//            System.out.println("Perimeter of rectangle: "
//                    + rect.perimeter());
//            rect.draw();

       //     ColorInterface rect2 = new Rectangle(2.0, 3.0);
            //rect2.draw("Green");
//            rect2.fillColor();
//            rect2.draw("Color");
//
//            Rectangle rectangle = new Rectangle(2,3);
//            rectangle.perimeter();
//            rectangle.getArea();
//            rectangle.fillColor();
//
//
//
//            Shape rectangleShape = new Rectangle();
//            rectangleShape.setValues(2.0,3.0);
//            System.out.println("Area of rectangleShape: "
//                    + ((Rectangle) rectangleShape).getArea());
//
//            System.out.println("Perimeter of rectangleShape: "
//                    + ((Rectangle) rectangleShape).perimeter());
//
//            // Creating the Objects of circle class
//            ShapeInterface circle = new Circle(2);
//            System.out.println("Perimeter of circle: "
//                    + circle.perimeter());
//            circle.draw();
//
//            ColorInterface cCircle = new Circle(2);
//            cCircle.draw("Green");


            Square square = new Square(5.0);
            System.out.println("Area of Square: "
                    + ((Square) square).getArea());
            System.out.println("Perimeter of Square: "
                    + square.perimeter());
           square.draw();
           square.draw("Blue");

//           Circle c = new Circle(5);
//           c.draw();
//           c.draw("Green");
//           c.fillColor();
//           System.out.println(c.perimeter());

        }

}
