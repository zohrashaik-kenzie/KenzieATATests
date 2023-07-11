package com.kenzie.examples.week9.Shape;

public class Application {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(12,10);
        System.out.println("Area = " + rect.calculate_area());
        System.out.println("Perimeter = " + rect.calculate_perimeter());
    }
}
