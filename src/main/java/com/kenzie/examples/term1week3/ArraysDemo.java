package com.kenzie.examples.term1week3;

public class ArraysDemo {

    public static void main(String[] args){

        String[] ingredients = {"milk", "eggs", "bread"};

        //create an array of elements to hold the names of the 7 days of the week
        String[] daysOfTheWeek = {"Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday", "Sunday"};

        String[] emptyJournal = new String[5];

        String[] participantNames = new String[6];
        participantNames[0] = "Zohra";
        participantNames[1] = "Kyle";
        participantNames[2] = "Towabalo";
        participantNames[3] = "Sean";
        participantNames[4] = "Sonya";
        participantNames[5] = "Tyler";

        int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 20;

        System.out.println(ingredients.length);

        Calculator.mul(intArray[0], intArray[1]);

        Calculator calculator = new Calculator();
        calculator.add( intArray[0], intArray[1]);
        calculator.sub(intArray[0], intArray[1]);
        int x;
        //int result = calculator.add(intArray[0],intArray[1]);
    }
}
