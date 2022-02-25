package com.kenzie.examples.equals;

public class EqualsDemo {

    public static void main (String[] args){

        SprayableShape shape1 = new SprayableShape(Spray.BLUE_GLOSS);
        SprayableShape shape2 = new SprayableShape(Spray.RED_MATTE);

        boolean compare = shape1.equals(shape2);

        RectangleShape rect1 = new RectangleShape(Spray.BLUE_GLOSS, 3, 5);
        RectangleShape rect2 = new RectangleShape(Spray.BLUE_GLOSS, 5, 3);

        boolean rectCompare = rect1.equals(rect2);
        System.out.println(rectCompare);

        System.out.println("Rectangle 1 " + rect1.hashCode());
        System.out.println("Rectangle 2 " + rect2.hashCode());

    }
}
