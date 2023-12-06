package com.kenzie.examples.generictesting;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashMapTest {
    @Test
    void hashmap_test_1(){
        HashMap<String,String> map  = new HashMap<>();
        map.put("Dish 1", "Zohra");
        assertTrue(map.containsKey("Dish 1"));
    }

    @Test
    void hashmap_test_key_not_present(){
        HashMap<String,String> map  = new HashMap<>();
        map.put("Dish 1", "Zohra");
        assertFalse(map.containsKey("Dish1"));
    }

    @Test
    void hashmap_test_size(){
        HashMap<String,String> map  = new HashMap<>();
        map.put("Dish 1", "Zohra");
        map.put("Dish 2", "Emily");
        map.put("Dish 3", "Joseph");

        assertTrue(map.size() == 3);
    }

    @Test
    void hashmap_test_size_empty_hashmap(){
        HashMap<String,String> map  = new HashMap<>();
        assertTrue(map.size() == 0);
    }

}
