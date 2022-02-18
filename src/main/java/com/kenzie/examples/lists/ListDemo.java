package com.kenzie.examples.lists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {



   public static void  main(String[] args){
       List<String> strList = new ArrayList<>();
       strList.add("Test 1");
       strList.add("Test 2");
       strList.add("Test 3");


       String[] stringArray = new String[3];
       stringArray[0] = "Test 1";
       stringArray[1] = "Test 2";
       stringArray[2] = "Test 3";
       stringArray[3] = "Test 3";
   }

}
