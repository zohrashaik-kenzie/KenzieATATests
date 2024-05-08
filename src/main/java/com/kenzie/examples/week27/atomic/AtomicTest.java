package com.kenzie.examples.week27.atomic;

import com.google.common.util.concurrent.AtomicDouble;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AtomicTest {

    //AtomicDouble number;
    double number;

    public AtomicTest(){
        //number = new AtomicDouble(0);
        number = 0;
    }

    public void increase(){
        number = number + 1.0;
//        number.addAndGet(1.0);
    }

    public double getNumber(){
        //return number.get();
        return number;
    }

    public static void main(String[] args) {
        //perfect with 1 thread not atomic, but what happens with 2?
        //not too bad with 2 threads, but what happens with more?
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        AtomicTest tester = new AtomicTest();

        int tests = 10000;

        for(int i = 0; i < tests; i++){
            executorService.submit(() -> tester.increase());
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("after " + Integer.toString(tests) + " increments number is now: "  + Double.toString(tester.getNumber()));
    }
}
