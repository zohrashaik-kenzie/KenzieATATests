package com.kenzie.examples.lists;

import java.util.ArrayList;
import java.util.List;

public class ListBigODemo {
    public static void deleteElements(List<Integer> list) {
        int numElements = list.size();
        for (int i = 0; i < numElements; i++) {
            list.remove(0);
        }
    }

    public static List<Integer> addElements(int m) {
        List<Integer> elementList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            elementList.add(0, i);
        }
        return elementList;
    }

    public static Integer getElement(List<Integer> list){
        return list.get(5);
    }

    public static void main(String[] args){
        List<Integer> list  = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        deleteElements(list);

        list= addElements(list.size());
        System.out.println(list.toString());
    }


}
