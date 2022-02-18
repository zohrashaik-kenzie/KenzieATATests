package com.kenzie.examples.bigo;

public class WorstCaseDemo {
    public static boolean contains(int[] haystack, int needle) {

        // does the haystack contain the needle?
        for (int n : haystack) {
            if (n == needle) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        int[] haystack = {1,2,3,4,5,6,7,8,9,10};
        boolean contains = contains(haystack, 1);

    }
}
