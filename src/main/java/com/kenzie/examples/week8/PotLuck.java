package com.kenzie.examples.week8;

import java.util.HashMap;

public class PotLuck {

    HashMap<String,String> dishMap;

    public PotLuck(){
        dishMap = new HashMap<>();
    }

    public PotLuck(HashMap<String, String> dishMap) {
        this.dishMap = new HashMap<>();
        for(HashMap.Entry<String, String> entry : dishMap.entrySet()){
          this.dishMap.put(entry.getKey(),entry.getValue());
        }

    }

    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Dish 1", "Zohra");
        hashMap.put("Dish 2", "Emily");
        hashMap.put("Dish 3", "Joseph");
        hashMap.put("Dish 4", "Egor");
        hashMap.put("Dish 5", "Nancy");
        hashMap.put("Dish 6", "Nancy");
        hashMap.put("Dish 7", "");
        PotLuck potLuck = new PotLuck(hashMap);
        potLuck.dishMap.put("Dish 7", "Kyle");
        return;
    }
}
