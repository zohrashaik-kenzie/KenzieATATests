package com.kenzie.examples.week13.iterators;

import com.kenzie.examples.polymorphism.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<ShapeInterface> shapeList = new ArrayList<>();
        shapeList.add(new Circle(10));
        shapeList.add(new Rectangle(10,12));
        shapeList.add(new Square(10));

        ListIterator<ShapeInterface> iterator = shapeList.listIterator();
//        while (iterator.hasNext())
//        {
//            ShapeInterface i = iterator.next();
//            System.out.println(i.toString());
//        }

        //set the first element to Hexagon
        iterator.add(new Hexagon());

        iterator = shapeList.listIterator();

        while (iterator.hasNext() && iterator.next() != null)
        {
        }
        iterator.add(new Rectangle(50,100));

        iterator = shapeList.listIterator();

        //update the second element with a Square of side 70
        iterator.next();
        iterator.next();
        iterator.set(new Square(70));

        iterator = shapeList.listIterator();
//        while (iterator.hasNext())
//        {
//            ShapeInterface i = iterator.next();
//            System.out.println(i.toString());
//        }
        //add a circle with radius 25 at index 3
        //remove the first element from the list
        iterator.next();
        iterator.add(new Hexagon());
        iterator = shapeList.listIterator();
        while (iterator.hasNext())
        {
            ShapeInterface i = iterator.next();
            System.out.println(i.toString());
        }

        iterator = shapeList.listIterator();
        //remove all Hexagons from the list
        System.out.println("removing hexagons");
        while (iterator.hasNext())
        {
            ShapeInterface i = iterator.next();
            if(i instanceof Hexagon)
                iterator.remove();
        }



        iterator = shapeList.listIterator();
        while (iterator.hasNext())
        {
            ShapeInterface i = iterator.next();
            iterator.remove();
        }
        iterator = shapeList.listIterator();
        System.out.println("List at the end");
        while (iterator.hasNext())
        {
            ShapeInterface i = iterator.next();
            System.out.println(i.toString());
        }


        //remove all items from the list

    }
}

