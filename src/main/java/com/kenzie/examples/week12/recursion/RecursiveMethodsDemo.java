package com.kenzie.examples.week12.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveMethodsDemo {

    static int sumValuesBottomUpRecursive(List<Integer> values) {
        // Base Case
        if(values.size() == 1) {
            return values.get(0);
        }
        // This recursive step's value
        // Plus the recursion result
        // values.sublist(1, values.size() creates a smaller sublist that will eventually return one element
        return values.get(0) + sumValuesBottomUpRecursive(values.subList(1, values.size()));
     }

    public static int sumValuesTopDownRecursive(List<Integer> values) {
        // What a wonderful base case
        if(values.size() == 1) {
            return values.get(0);
        }
        // sumValuesTopDownRecursive(values.sublist(0, values.size() - 1)) recursive step
        // values.get(values.size() - 1) getting the current element
        return sumValuesTopDownRecursive(values.subList(0, values.size() - 1)) + values.get(values.size() - 1);
    }

    public static int sumValuesHalfHalfRecursive(List<Integer> values) {
        return sum(values, 0, values.size() - 1);
    }

    public  static int sum(List<Integer> values, int leftIndex, int rightIndex) {
        if(leftIndex == rightIndex) {
            return values.get(leftIndex);
        }
        int mid = (leftIndex + rightIndex) / 2;
        return sum(values, leftIndex, mid) + sum(values,mid + 1, rightIndex);
    }

    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(10);
        integerList.add(500);
        integerList.add(20);

        //System.out.println("sumValuesBottomUpRecursive = " + sumValuesBottomUpRecursive(integerList));
        //System.out.println("sumValuesTopDownRecursive = " + sumValuesTopDownRecursive(integerList));
        System.out.println("sumValuesHalfHalfRecursive = " + sumValuesHalfHalfRecursive(integerList));

    }



}
