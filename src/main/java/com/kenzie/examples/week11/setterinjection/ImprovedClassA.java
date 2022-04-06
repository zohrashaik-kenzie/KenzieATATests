package com.kenzie.examples.week11.setterinjection;

public class ImprovedClassA {
    ClassB classB;

    ImprovedClassA(ClassB x){
        this.classB = x;
    }

    double tenPercent() {
        return classB.calculate() * 0.1d;
    }

    public static void main(String... args) {

        ClassB improvedClassB = new ImprovedClassB();

        ImprovedClassA classA = new ImprovedClassA(improvedClassB);

        System.out.println("Ten Percent: " + classA.tenPercent());
    }
}
