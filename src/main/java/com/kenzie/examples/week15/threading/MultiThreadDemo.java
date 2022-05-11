package com.kenzie.examples.week15.threading;

public class MultiThreadDemo implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread("Thread1");
        Thread thread2 = new Thread("Thread2");
        thread1.start();
        thread2.start();
        System.out.println("The threads are:");
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
    }
    @Override
    public void run() {
    }
}

