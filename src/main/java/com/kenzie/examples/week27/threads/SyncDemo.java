package com.kenzie.examples.week27.threads;

public class SyncDemo {
    public static void main(String args[]) {

        PrintDemo PD = new PrintDemo();
        //PrintDemo PD = new PrintDemo();

        SyncThread T1 = new SyncThread( "Thread - 1 ", PD );
        SyncThread T2 = new SyncThread( "Thread - 2 ", PD );

        T1.start();
        T2.start();

        PD.method2("main ");

        // wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch ( Exception e) {
            System.out.println("Interrupted");
        }
    }
}
