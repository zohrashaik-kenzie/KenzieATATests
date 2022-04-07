package com.kenzie.examples.week11.linkedlist;

// Java Program to find an element in a Linked List

// Importing the Linked List class
import java.util.LinkedList;

class SearchLinkedList {
    public static void main(String[] args)
    {
        // Initializing the Linked List
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the Linked List
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        // Element to be searched
        int element = 4;

        // Initializing the answer to the index -1
        int ans = -1;

        // Traversing through the Linked List
        for (int i = 0; i < linkedList.size(); i++) {

            // Extracting each element in
            // the Linked List
            int linkedListElement = linkedList.get(i);

            // Checking if the extracted element is equal to
            // the element to be searched
            if (linkedListElement == element) {

                // Assigning the index of the
                // element to answer
                ans = i;
                break;
            }
        }
        // Checking if the element is present in the Linked
        // List
        if (ans == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println(
                    "Element found in Linked List at " + ans);
        }
    }
}