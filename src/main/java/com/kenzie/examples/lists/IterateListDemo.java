package com.kenzie.examples.lists;
import java.util.*;
public class IterateListDemo {

// Java program to Iterate the Elements
// in an ArrayList
        // main driver method
    public static void main(String args[])
    {
            // Creating an empty Arraylist of string type
            List<String> al = new ArrayList<>();

            // Adding elements to above object of ArrayList
            al.add("SEBD");
            al.add("ATA");
            al.add(1, "Advanced");
            al.add("Course");

            // Using  for loop for iteration
            for (int i = 0; i < al.size(); i++) {
                System.out.print(al.get(i) + " ");
            }
           System.out.println();
            for (String str : al)
                System.out.print(str + " ");
//
//        // Iterate without using Lambda
        Iterator iterator = al.iterator();
        System.out.println();
           while (iterator.hasNext()) {
               System.out.print(iterator.next() + " ");
           }
        System.out.println();
//        //lambda
          al.forEach(xyx->System.out.print(xyx + " "));
//
        }


    }

