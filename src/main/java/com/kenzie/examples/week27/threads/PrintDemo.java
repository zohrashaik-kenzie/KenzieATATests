package com.kenzie.examples.week27.threads;

class PrintDemo {

    public synchronized void method2(String threadName){
        System.out.println(threadName + ": I'm here");
    }

    public synchronized void printCount(String threadName) {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(threadName +": Counter   ---   "  + i );
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
        method2(threadName);
    }
}
