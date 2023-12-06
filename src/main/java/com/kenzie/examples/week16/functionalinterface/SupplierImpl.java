package com.kenzie.examples.week16.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierImpl implements Supplier<Integer> {
    @Override
    public Integer get() {
        Random random = new Random();
        return new Integer(random.nextInt(2));
    }
}
