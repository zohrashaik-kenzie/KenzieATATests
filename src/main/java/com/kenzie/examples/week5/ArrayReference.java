package com.kenzie.examples.week5;


import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayReference {


    public static int[] insertAtEnd(int[] array, int a){
        int[] new_array = Arrays.copyOf(array,array.length+1);
        new_array[array.length] = a;
        return new_array;
    }

    public static void main(String[] args){

        Integer x = 10;
        //int x = 10;
        x.compareTo(15);
        int[] array_one = {1,12,1,-7,3};
        ArrayList<Integer> arrayList_one = new ArrayList<>();

        int[] array_two = {1,2,9,13,0};
        int[] array_three = {1,12,1,-7,3};
        System.out.println(Arrays.equals(array_one,array_two));
        System.out.println(Arrays.equals(array_one,array_three));
        Arrays.fill(array_one, 1, 3, 99);
        System.out.println(Arrays.toString(array_one));
       Arrays.sort(array_one);
        System.out.println(Arrays.toString(array_one));
        array_two = Arrays.copyOf(array_one,10);
//
        System.out.println(Arrays.toString(array_two));
//
//        int len = array_one.length;
        //int[] new_array = new int[len+1];
//
//
 //          array_two = array_one;
 //          array_two[4] = -9;

            int a = 10;
            int[] new_array = ArrayUtils.addAll(array_three,array_two);
           System.out.println(Arrays.toString(new_array));
           //{10,12,1,-7,3,10}


    }
}
