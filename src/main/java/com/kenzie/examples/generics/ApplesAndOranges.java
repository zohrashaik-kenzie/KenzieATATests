package com.kenzie.examples.generics;

public class ApplesAndOranges {
    public static class Util {
        public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
            return p1.getKey().equals(p2.getKey()) &&
                    p1.getValue().equals(p2.getValue());
        }
    }



    public static void main(String[] args){
        Pair<Integer, String> p1 = new Pair<>(1, "Apples");
        Pair<Integer, String> p2 = new Pair<>(1, "Apples");

        boolean same = Util.<Integer, String>compare(p1, p2);

        //type inference
        boolean same2 = Util.compare(p1, p2);

        System.out.println("Done!");
    }

}