package com.kenzie.examples.patterns;

public class Math {

    int x;
    int y;
    String operation;

    private final static Math mathInstance = new Math();
    private Math() {
    }

    public  Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static Math getMathInstance() {
        return mathInstance;
    }

    public static void main(String[] args){
        for(int i=0;i<1000;i++) {
            Math addition = Math.getMathInstance();
            Integer result = addition.add(i, 2);
            System.out.println("Result = " + result);
         }

    }
}
