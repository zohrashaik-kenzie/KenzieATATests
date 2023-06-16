package com.kenzie.examples.week7;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dish 1");
        arrayList.add("Dish 2");
        arrayList.add("Dish 3");
        arrayList.add("Dish 4");
        arrayList.add("Dish 5");
        arrayList.add("Dish 6");
        arrayList.add("Dish 7");
        arrayList.add("Dish 8");
        arrayList.add("Dish 9");
        arrayList.add("Dish 10");


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Dish 1", "Zohra");
        hashMap.put("Dish 2", "Emily");
        hashMap.put("Dish 3", "Joseph");
        hashMap.put("Dish 4", "Egor");
        hashMap.put("Dish 5", "Nancy");
        hashMap.put("Dish 6", "Nancy");
        hashMap.put("Dish 7", "");
        hashMap.putIfAbsent("Dish 9", "Kyle");
//        String personName = hashMap.get("Dish 3");
//
//        if(!hashMap.containsKey("Dish 6")) {
//            hashMap.put("Dish 6", "Kyle");
//        }
//        personName = hashMap.get("Dish 6");
//        System.out.println(personName);

//        if(hashMap.containsValue("Nancy")){
//            System.out.println("Dish  exists");
//        } else {
//            System.out.println("Dish does not exist");
//        }

//        for(String currentKey : hashMap.keySet()){
//            System.out.print(currentKey + " - ");
//            System.out.println(hashMap.get(currentKey));
//        }

//        for(String currentValue : hashMap.values()){
//            System.out.print(currentValue + " - ");
//        }
//
//        for(HashMap.Entry<String, String> entry : hashMap.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println();
//        }
        HashMap<String, ArrayList<String>> hashMapList = new HashMap<>();


    }
}
