package com.kenzie.examples.week11.dependencyinjection;

public class ClassA {
    ClassB classB = new ClassB();

    double tenPercent() {

        return classB.calculate() * 0.1d;
    }

    public static void main(String... args) {
        ClassA classA = new ClassA();

        System.out.println("Ten Percent: " + classA.tenPercent());
    }

}
