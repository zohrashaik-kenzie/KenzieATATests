package com.kenzie.examples.mutable;

import java.util.ArrayList;
import java.util.List;

public class HeapClass {

    public static void printList(List<String> data) {
        System.out.println(data);
        return;
    }

    public static void printList2(List<String> data) {
        String newService = "Kindle";
        data.add(newService);
        data.set(0, newService);
        System.out.println(data);
        return;
    }

    public static void main(String[] args) {
        List<String> amazonServices = new ArrayList<String>();
        amazonServices.add("Prime");
        amazonServices.add("AWS");
        amazonServices.add("Audible");
        List<String> amazonServices2 = new ArrayList<String>();
        amazonServices2.addAll(amazonServices);
        printList2(amazonServices2);
        int count = 0;
        for(int i=0;i<10;i++){
            count = 10;
        }

        return;
    }
}
