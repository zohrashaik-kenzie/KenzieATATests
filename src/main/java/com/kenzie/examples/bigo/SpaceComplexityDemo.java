package com.kenzie.examples.bigo;

public class SpaceComplexityDemo {
    public static void sayHiNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("hi");
        }
     }
     // O(n); O(1) space
    public static String[] arrayOfHiNTimes(int n) {
        String[] hiArray = new String[n*n];
        for (int i = 0; i < n; i++) {
            hiArray[i] = "hi";
        }
        return hiArray;
     }
     //O(n); O(n^2) space

    public static int getLargestItem(int[] items) {
        int largest = Integer.MIN_VALUE;
        for (int item : items) {
            String s = new String("hi");
            if (item > largest) {
                largest = item;
            }
        }
        return largest;

        //O(n); O(n) space
    }

    public static void main(String[] args){
        int[] items = {1,2,3,4};

        //sayHiNTimes(10);
       // arrayOfHiNTimes(items.length);
        getLargestItem(items);
    }
}
