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

//       for(int idx=0;idx<strList.size();idx++){
//           System.out.println(strList.get(idx));
//       }

       ArrayList<String> strList2 = new ArrayList<>();
       strList2.add("Test 6");
       strList2.add("Test 7");
       strList2.add("Test 8");
       strList2.remove("Test 6");


//       for(int idx=0;idx<strList2.size();idx++){
//           System.out.println(strList2.get(idx));
//       }

       ArrayList<Integer> integerList = new ArrayList<>();
       integerList.add(30);
       integerList.add(1,14);
       integerList.add(20);
       integerList.add(2,30);
       integerList.add(30);

       Integer int30 = 30;

      // integerList.remove

       //30,14,30,20,30

       for(Integer integer:integerList){
           System.out.println(integer);
       }
       System.out.println(integerList.lastIndexOf(30));

       String[] array = {"Hi", "Hello"};
       ArrayList<String> convertedList = new ArrayList<>(Arrays.asList(array));
       Integer[] primitiveIntArray = {10,20,30,40};
       ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(primitiveIntArray));
       
   }

}
