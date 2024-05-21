package com.kenzie.examples.week15.threading;

public class MultiThreadDemo implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread("Thread1");
        Thread thread2 = new Thread("Thread2");
        System.out.println("Phase 1:");
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        thread1.start();
        System.out.println("Phase 2:");
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        thread2.start();
        System.out.println("Phase 3:");
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());

//        System.out.println("Phase 4:");
//        System.out.println(thread1.getState());
//        System.out.println(thread2.getState());

    }
    @Override
    public void run() {
    }
}

