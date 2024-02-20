package com.kenzie.examples.week27.atomic;

import java.util.HashMap;

public class SomeFunction {

    Thread thread;
    int myInt;
    HashMap<String, String> map;
    double myDouble;
    long myLong;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String key : map.keySet()) {
            sb.append(String.format("Key: %s Value: %s",
                    key, map.get(key)));
        }
        return "SomeFunction{" +
                "thread=" + thread +
                ", myInt=" + myInt +
                ", map=" + sb +
                ", myDouble=" + myDouble +
                ", myLong=" + myLong +
                '}';
    }

    void setValues(int passedInt, long passedLong,
                   double passedDouble,
                   HashMap<String, String> passedMap) {
        thread = Thread.currentThread();
        myInt = passedInt;
        map = passedMap;
        myDouble = passedDouble;
        myLong = passedLong;
    }
}
