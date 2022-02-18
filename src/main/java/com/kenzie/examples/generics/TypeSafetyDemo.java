package com.kenzie.examples.generics;
import java.util.*;

public class TypeSafetyDemo {
    // Java program to demonstrate that NOT using
// generics can cause run time exceptions

    public static void main(String[] args)
    {
        // Creating an ArrayList without any type specified
        List<String> al = new ArrayList();

        al.add("Week 1");
        al.add("Week 2");
        al.add("Week 3");
       // al.add(10); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = al.get(2);


    }
}

