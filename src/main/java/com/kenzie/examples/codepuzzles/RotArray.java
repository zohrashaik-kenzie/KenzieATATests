package com.kenzie.examples.codepuzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RotArray {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        for (int i = 0; i < d; i++) {
            int first = a.get(0);
            a.add(a.size(), first);
            a.remove(0);
        }
        return a;
    }

    public static List<Integer> listLeftRotation(List<Integer> a,  int k) {

        //n is the size of the array, k is the number of rotationsint
        int n= a.size();
       List<Integer> returnList = new ArrayList<>();
       for(int i=0;i<n;i++)
           returnList.add(i);
       for(int i=0;i<k;i++)
           returnList.set(n-k+i, a.get(i)) ;
       for(int i=0;i<n-k;i++)
           returnList.set(i, a.get(k+i));
        return returnList;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(41,73, 89, 7 ,10, 1, 59, 58, 84, 77, 77, 97, 58, 1 ,86, 58 ,26 ,10, 86, 51));
        System.out.println("Rotated Array = " + listLeftRotation(list,10));
    }

}
