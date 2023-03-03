package com.kenzie.examples.lists;

import java.util.NoSuchElementException;


public class LinkedIntList {

    // helper linked list node class
    private class Node {
        private int item;
        private Node next;

        public Node() {
        }

        //creates a node without any connections
        public Node(int number) {
            item = number;
            next = null;
        }
        public Node(int number, Node nextNode) {
            item = number;
            next = nextNode;
        }

        public int getItem() {
            return item;
        }
    }

    private Node first; // first node of the list

    /**
     * Constructs an empty list.
     */
    public LinkedIntList() {
        first = null;
    }

    /**
     * Constructs a list containing the elements of the specified array, in the
     * order they appear in the array.
     *
     * @param data the array whose elements are to be placed into this list
     * @throws NullPointerException if the specified array is null
     */
    public LinkedIntList(int[] data) {
        LinkedIntList llList = new LinkedIntList();
        Node currentNode = null;
        for(int i=0;i<data.length;i++){
            Node node = new Node(data[i]);
            if (i == 0){ //this becomes the first node of the linked list
                first = node;
                currentNode = first;
            } else {
                currentNode.next = node;
                currentNode = node;
            }
        }
        //first = LinkedIntListH(data, 0);
    }

    private Node LinkedIntListH(int[] data, int index) {
        if (index > data.length)
            return null;
        Node temp = LinkedIntListH(data, index+1);
        return new Node(data[index], temp);

    }



    /**
     * Constructs a string representing the list. The ints in the list appear in a
     * comma separated list contained inside square brackets.
     *
     * @return a string represeting the list.
     */
    public String toString() {
        if (first == null)
            return "[]";
        String answer = "[" + first.item;
        Node ptr = first.next;
        while (ptr != null) {
            answer += ", " + ptr.item;
            ptr = ptr.next;
        }
        answer += "]";
        return answer;
    }

    /**
     * Prints the list to StdOut as a comma separted list inside of square brackets
     */
    public void printList() { // TODO
        printListH(first);
    }

    private void printListH(Node n) {
        if (n == null) {
            return;
        } else {
            System.out.println(n.item);
            printListH(n.next);
        }
    }

    /**
     * Returns the first int in this list.
     *
     * @return the first int in this list
     * @throws NoSuchElementException if this list is empty
     */
    public int getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.item;
    }

    /**
     * Removes and returns the first int from this list.
     *
     * @return the first int from this list
     * @throws NoSuchElementException if this list is empty
     */
    public int removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        int answer = first.item;
        first = first.next;
        return answer;
    }

    /**
     * Inserts the specified int at the beginning of this list. Shifts all ints
     * already in the list to the right (adds one to their indices).
     *
     * @param i the int to add
     */
    public void addFirst(int i) {
        Node newFirst = new Node();
        newFirst.item = i;
        newFirst.next = first;
        first = newFirst;
    }

    /**
     * Returns {@code true} if this list contains the specified int.
     *
     * @param i int whose presence in this list is to be tested
     * @return {@code true} if this list contains the specified element
     */
    public boolean contains(int i) { // TODO
        return containsH(first, i);
    }

    private boolean containsH(Node n, int i) {
        if (n == null)
            return false;
        if (n.item == i)
            return true;
        boolean temp = containsH(n.next, i);
        return temp;
        // return (n.item == i) || temp == true;
    }

    /**
     * Removes the first occurrence of the specified int in this list (when
     * traversing the list from head to tail). If the list does not contain the int,
     * it is unchanged.
     *
     * @param i int to be removed from this list, if present
     */
    public void removeFirstOccurrence(int i) { // TODO
        first = removeFirstOccurrenceH(first, i);
    }

    private Node removeFirstOccurrenceH(Node n, int i) {
        if (n == null) {
            return null;
        } else if (n.item == i) {
            return n.next;
        } else {
            Node temp = removeFirstOccurrenceH(n.next, i);
            n.next = temp;
            return n;
        }
    }

    /**
     * Returns the int at the specified position in this list.
     *
     * @param index index of the int to return
     * @return the int at the specified position in this list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public int get(int index) { // TODO
        return getH(first, index);
    }

    /**
     * Returns value at position index in the list whose first node is n
     *
     * @param n     first Node of the list
     * @param index the position we want
     * @return value at position index in the list whose first node is n
     */
    private int getH(Node n, int index) {
        if (n == null)
            throw new IndexOutOfBoundsException();
        if (index == 0)
            return n.item;
        else {
            int temp = getH(n.next, index - 1);
            return temp;
        }
    }

    /**
     * Replaces the int at the specified position in this list with the specified
     * int.
     *
     * @param index index of the element to replace
     * @param i     int to be stored at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public void set(int index, int i) { // TODO
        throw new RuntimeException("Not implemented");
    }

    /**
     * Inserts the specified int at the specified position in this list. Shifts the
     * int currently at that position (if any) and any subsequent ints to the right
     * (adds one to their indices).
     *
     * @param index index at which the specified int is to be inserted
     * @param i     int to be inserted
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public void add(int index, int i) { // TODO
        throw new RuntimeException("Not implemented");
    }

    /**
     * Checks if this list is equal to the argument list
     *
     * @param other the list to compare against
     * @return {@code true} if this list equals {@code other} and {@code false}
     *         otherwise.
     */
    public boolean equals(LinkedIntList other) { // TODO
        return equalsH(first, other.first);
    }

    private boolean equalsH(Node n, Node otherN) {
        if (n == null && otherN == null)
            return true;
        if (n == null || otherN == null)
            return false;
        if (n.item != otherN.item)
            return false;
        boolean temp = equalsH(n.next, otherN.next);
        return temp;
    }

    /**
     * Copies this list.
     *
     * @return a copy of {@code this} list.
     */
    public LinkedIntList copy() { // TODO
        LinkedIntList result = new LinkedIntList();
        result.first = (first);
        return result;
    }

    /**
     * Creates a copy of a list
     * @param n first node of the list to be copied
     * @return first node of the copy
     */
    private Node copyH(Node n) {
        if (n == null)
            return null;
        else {
            Node temp = copyH(n.next);
            Node result = new Node();
            result.item = n.item;
            result.next = temp;
            return result;
        }
    }

    /*********************HOMEWORK************************/

    /**
     * Returns the index of the first occurrence of the specified int in this list,
     * or -1 if this list does not contain the int.
     *
     * @param i int to search for
     * @return the index of the first occurrence of the specified int in this list,
     *         or -1 if this list does not contain the int
     */
    public int indexOf(int i) {
        return indexOfH(first, i);
    }

    private int indexOfH(Node front, int i) {  // TODO
        throw new RuntimeException("Not implemented");
    }

    /**
     * Returns the number of times a specified number appears in the list.
     *
     * @param i int to be counted
     * @return the number of times the number {@code i} appears in the list
     */
    public int count(int i) {
        return countH(first, i);
    }

    private int countH(Node front, int i) {

        int count = 0;
        while(front != null){
           if (front.getItem() == i){
               count ++;
           }
           front = front.next;
       }
        return count;
    }

    /**
     * Computes the sum of all the ints in the list.
     *
     * @return the sum of all the ints in the list
     */
    public int sum() {
        return sumH(first);
    }

    private int sumH(Node front) {  // TODO
        throw new RuntimeException("Not implemented");
    }

    /**
     * Constructs a new {@code LinkedIntList} consisting of just the even number
     * from this list appearing in the same order as they occur in this list.
     *
     * @return a new list that looks like this list be with all the odds removed.
     */
    public LinkedIntList evens() {
        LinkedIntList answer = new LinkedIntList();
        answer.first = evensH(first);
        return answer;
    }

    public Node evensH(Node front) {  // TODO
        throw new RuntimeException("Not implemented");
    }

    /**
     * Constructs a new int list where each entry in the new list is the sum of the
     * corresponding entries in this list and the argument list.
     *
     * @arg otherList the other list to be added to this list
     * @return a new list where each entry in the new list is the sum of the
     *         corresponding entries in this list and the argument list
     * @throws IllegalArgumentException if this list and the other list have have
     *                                  different lengths
     */
    public LinkedIntList listAddition(LinkedIntList otherList) {
        LinkedIntList answer = new LinkedIntList();
        answer.first = listAdditionH(first, otherList.first);
        return answer;
    }

    public Node listAdditionH(Node thisFront, Node otherFront) {  // TODO
        LinkedIntList answer = new LinkedIntList();
        Node currNode1 = thisFront;
        Node currNode2 = otherFront;
        Node currNode3 = answer.first;
        int index = 0;
        do {
            if (currNode1 == null){
                throw new IllegalArgumentException("First List too short");
            }
            if (currNode2 == null){
                throw new IllegalArgumentException("Second List too short");
            }
            Node node3 = new Node(currNode1.getItem() + currNode2.getItem());
            if (index == 0){
                answer.first = node3;
                currNode3 = answer.first;
            } else {
                currNode3.next = node3;
                currNode3 = node3;
            }
            index++;
            currNode1 = currNode1.next;
            currNode2 = currNode2.next;
        } while ((currNode1 != null || currNode2 != null));
        return answer.first;
    }

    /* A small main to get started testing */
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 2, 5,6};
        LinkedIntList l = new LinkedIntList(a);
        System.out.println("The list: " + l.toString());
        System.out.printf("has %d occurences of the number 2", l.count(2));

        int[] b = {2,3,4,5,6,7};
        LinkedIntList l2 = new LinkedIntList(b);
        LinkedIntList additionList = l.listAddition(l2);
        System.out.println("The list: " + additionList.toString());
    }
}
