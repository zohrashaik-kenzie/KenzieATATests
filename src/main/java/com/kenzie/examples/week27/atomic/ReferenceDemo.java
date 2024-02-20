package com.kenzie.examples.week27.atomic;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReferenceDemo {



    public static void main(String[] args){
        Long myLong = Long.valueOf(5);
        Long otherLong = myLong;
        SomeFunction sf = new SomeFunction();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(new Runnable() {
            public void run() {
               SomeFunction sf = new SomeFunction();
               HashMap<String,String> hm = new HashMap();
               hm.put("a","1");
               hm.put("b","2");
               sf.setValues(5,Long.valueOf(10),1.5,hm);
               System.out.println(sf.toString());
            }
        });

        executorService.submit(new Runnable() {
            public void run() {
                SomeFunction sf = new SomeFunction();
                HashMap<String,String> hm = new HashMap();
                hm.put("c","3");
                hm.put("d","4");
                sf.setValues(6,Long.valueOf(100),2.5,hm);
                System.out.println(sf.toString());
            }
        });
        executorService.submit(new Runnable() {
            public void run() {
                SomeFunction sf = new SomeFunction();
                HashMap<String,String> hm = new HashMap();
                hm.put("e","5");
                hm.put("f","6");
                sf.setValues(7,Long.valueOf(1000),3.5,hm);
                System.out.println(sf.toString());
            }
        });
        executorService.shutdown();
    }
}
