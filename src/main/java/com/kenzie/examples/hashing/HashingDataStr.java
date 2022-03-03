package com.kenzie.examples.hashing;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Objects;

public class HashingDataStr {

    private List<Integer> list;

    private Hashtable<Integer,List<Integer>> table;

    public HashingDataStr(List<Integer> list) {
        this.list = list;

        table = new Hashtable<>();

        for(Integer i: list) {
            int key = hashInt(i);

            List<Integer> listi = table.get(key);
            if(listi != null && listi.size() > 0){
                listi.add(i);
            } else {
                List<Integer> listj = new ArrayList<>();
                listj.add(i);
                table.put(key,listj);
            }


        }
    }

    private int hashInt(int value){
        return value%10;
    }

    @Override
    public String toString() {
        return "HashingDataStr{" +
                "table=" + table +
                '}';
    }
}
