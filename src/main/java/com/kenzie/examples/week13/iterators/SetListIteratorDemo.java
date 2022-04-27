package com.kenzie.examples.week13.iterators;

import com.kenzie.examples.polymorphism.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SetListIteratorDemo {
    public static void main(String[] args) {
        List<ShapeInterface> shapeList = new ArrayList<>();
        shapeList.add(new Circle(10));
        shapeList.add(new Rectangle(10,12));
        shapeList.add(new Square(10));

        ListIterator<ShapeInterface> iterator = shapeList.listIterator();
        iterator.next();
        iterator.next();
        iterator.set(new Hexagon());

        ListIterator<ShapeInterface> iterator2 = shapeList.listIterator();
        while (iterator2.hasNext())
        {
            ShapeInterface i = iterator2.next();
            System.out.println(i.toString());
        }
    }
}
