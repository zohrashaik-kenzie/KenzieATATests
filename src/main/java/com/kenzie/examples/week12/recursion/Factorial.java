package com.kenzie.examples.week12.recursion;

public class Factorial {

    static int factorial(int n){
        if( n == 1){
            return 1;
        }
        return n* factorial(n-1);
    }

    public static void main(String[] args){
        System.out.println("Factorial 5 = " + factorial(5));
    }
}
