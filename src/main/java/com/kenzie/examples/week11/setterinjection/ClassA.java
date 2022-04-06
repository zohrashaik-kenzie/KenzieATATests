package com.kenzie.examples.week11.setterinjection;

public class ClassA {
    ClassB classB;

    /* Setter Injection */
    void setClassB(ClassB injected) {
        classB = injected;
    }

    double tenPercent() {

        return classB.calculate() * 0.1d;
    }

//    public static void main(String... args) {
//        ClassA classA = new ClassA();
//        ClassB classB = new ClassB();
//
//        classA.setClassB(classB);
//
//        System.out.println("Ten Percent: " + classA.tenPercent());
//    }
    public static void main(String... args) {
        ClassA classA = new ClassA();

        System.out.println("Ten Percent: " + classA.tenPercent()); // NullPointerException here
    }
//   public static void main(String... args) {
//        ClassA classA = new ClassA();
//        ClassB improvedClassB = new ImprovedClassB();
//
//        classA.setClassB(improvedClassB);
//
//        System.out.println("Ten Percent: " + classA.tenPercent());
//    }


}
