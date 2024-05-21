package com.kenzie.examples.week13.iterators;

import com.kenzie.examples.polymorphism.Circle;
import com.kenzie.examples.polymorphism.Rectangle;
import com.kenzie.examples.polymorphism.ShapeInterface;
import com.kenzie.examples.polymorphism.Square;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public IteratorDemo() {
    }

    public static void main(String[] args) {
        // Make a collection
//        ArrayList<String> shapes = new ArrayList<>();
//        shapes.add("Rectangle");
//        shapes.add("Circle");
//        shapes.add("Square");
//        shapes.add("Triangle");
//        // Get the iterator
//        Iterator<String> it = shapes.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

        List<ShapeInterface> shapeList = new ArrayList<>();
        shapeList.add(new Circle(10));
        shapeList.add(new Rectangle(10,12));
        shapeList.add(new Square(10));

        Iterator<ShapeInterface> itList = shapeList.iterator();

        while(itList.hasNext()) {
            itList.remove();
        }
    }
}
