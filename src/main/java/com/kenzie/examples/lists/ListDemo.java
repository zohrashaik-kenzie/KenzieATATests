package com.kenzie.examples.lists;

import java.util.ArrayList;
import java.util.Arrays;


public class ListDemo {



   public static void  main(String[] args){
       ArrayList<String> strList = new ArrayList<>();
       strList.add("Test 1");
       strList.add("Test 2");
       strList.add("Test 3");
       strList.add("Test 4");
       strList.add("Test 5");

//       for(String str: strList){
//           System.out.println(str);
//       }

       for(int idx=0;idx<strList.size();idx++){
           System.out.println(strList.get(idx));
       }
////
//       ArrayList<String> strList2 = new ArrayList<>();
//       strList2.add("Test 6");
//       strList2.add("Test 7");
//       strList2.add("Test 8");
//
//       strList2.indexOf("Test 7");
//
//
//       for(int idx=0;idx<strList2.size();idx++){
//           System.out.println(strList2.get(idx)); //array_one[idx]
//       }
////
//       //   ArrayList<String> strList = new ArrayList<>();
//       ArrayList<Integer> integerList = new ArrayList<>();
//       integerList.add(9); //9
//       integerList.add(1,14); //9,14
//       integerList.add(6); //9,14,6
//       integerList.set(2,13); //9,14,13
//       integerList.add(25); //9,14,13,25
//       integerList.add(6);
//       integerList.add(20);
//       integerList.add(6);
//
//       integerList.lastIndexOf(6);
//       boolean flag = integerList.contains(25);
//       for(Integer integer:integerList){
//            System.out.println(integer);
//       }
//
//       Integer int30 = 30;
//
//      // integerList.remove
//
//       //30,14,30,20,30
//
//       for(Integer integer:integerList){
//           System.out.println(integer);
//       }
//       System.out.println(integerList.lastIndexOf(30));
//
         String[] array = {"Hi", "Hello"};
         ArrayList<String> convertedList = new ArrayList<>(Arrays.asList(array));
         System.out.println(convertedList);
         for(String element:convertedList){
             System.out.println(element);
         }
       Integer[] primitiveIntArray = {10,20,30,40};
       ArrayList<Integer> intArrayList = new ArrayList<Integer>(Arrays.asList(primitiveIntArray));
//
   }

   int x = 10;
   Integer integerX = x;

}
