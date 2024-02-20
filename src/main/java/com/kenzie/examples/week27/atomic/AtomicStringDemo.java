package com.kenzie.examples.week27.atomic;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicStringDemo {

    private final AtomicReference<String> atomicString = new AtomicReference<>("InitialValue");

    public void updateString(String newValue) {
        atomicString.set(newValue);
    }

    public String getString() {
        return atomicString.get();
    }

    public boolean compareAndSetString(String expect, String update) {
        return atomicString.compareAndSet(expect, update);
    }

}

