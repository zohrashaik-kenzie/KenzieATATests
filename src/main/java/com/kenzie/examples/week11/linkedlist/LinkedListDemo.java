package com.kenzie.examples.week11.linkedlist;

import java.util.*;

public class LinkedListDemo {
    public static void main(String args[])  {
        //create a linked list 
        LinkedList<String> linkedList = new LinkedList<String>();

        // Add elements to linkedList using various add methods
        linkedList.add("B");
        linkedList.add("C");
        linkedList.addLast("G");
        linkedList.addFirst("A");
        linkedList.add(3, "D");
        linkedList.add("E");
        linkedList.add("F");
        //print the linkedList
        System.out.println("Linked list : " + linkedList);

        //Create and initialize an ArrayList
        ArrayList<String> aList = new ArrayList<>();
        aList.add("H");
        aList.add("I");
        //add the ArrayList to linkedList using addAll method
        linkedList.addAll(aList);
        //print the linkedList
        System.out.println("Linked list after adding ArrayList contents: " + linkedList);
//
        // use various remove methods to remove elements from linkedList
        linkedList.remove("B");
        linkedList.remove(3);
        linkedList.removeFirst();
        linkedList.removeLast();
        //print the altered list
        System.out.println("Linked list after deletion: " + linkedList);
//
       // use contains method to check for an element in the linkedList
        boolean ret_value = linkedList.contains("G");
        //print the results of contains method
        if(ret_value)
            System.out.println("List contains the element 'G' ");
        else
            System.out.println("List doesn't contain the element 'G'");
//
//        // use size methods to return Number of elements in the linked list
        int size = linkedList.size();
        System.out.println("Size of linked list = " + size);

        // Get and set elements from linked list
        Object element = linkedList.get(3);
        System.out.println("Element returned by get() : " + element);
        linkedList.set(3, "J");
        System.out.println("Linked list after change : " + linkedList);
//
//        //convert linkedList to Array using toArray methods
        String [] list_array = linkedList.toArray(new String[linkedList.size()]);

        System.out.println("Array obtained from linked List:" +
                Arrays.toString(list_array));

    }
}