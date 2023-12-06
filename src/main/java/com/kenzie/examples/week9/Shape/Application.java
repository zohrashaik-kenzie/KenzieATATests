package com.kenzie.examples.week9.Shape;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(12,10);
        System.out.println("Area = " + rect.calculate_area());
        System.out.println("Perimeter = " + rect.calculate_perimeter());

        ShapeInterface si = new Square();
        List<String> arrayList = new ArrayList<String>();
    }
}
