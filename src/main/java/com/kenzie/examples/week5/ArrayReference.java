package com.kenzie.examples.week5;


import com.kenzie.examples.week6.Department;
import com.kenzie.examples.week6.Employee;

import java.util.Arrays;

public class ArrayReference {


    public static int[] insertAtEnd(int[] array, int a){
        int[] new_array = Arrays.copyOf(array,array.length+1);
        new_array[array.length] = a;
        return new_array;
    }

    public static void main(String[] args){

        Employee employee = new Employee();
        employee.setEmployeeID("1000");

        Department dept  = new Department();


      //  System.out.println(Arrays.equals(array_one,array_two));
        //Arrays.fill(array_one, 1, 4, 99);
//        Arrays.sort(array_one);
//        System.out.println(Arrays.toString(array_one));
//        array_two = Arrays.copyOf(array_one,10);
//
//        System.out.println(Arrays.toString(array_two));

//        int len = array_one.length;
//        int[] new_array = new int[len+1];
//
//
//
////           array_two = array_one;
////           array_two[4] = -9;
//
            int a = 10;
         //   int[] new_array = ArrayUtils.addAll(array_one,array_two);
           //System.out.println(Arrays.toString(new_array));
//           //{10,12,1,-7,3,10}
//
//           return;

    }
}
