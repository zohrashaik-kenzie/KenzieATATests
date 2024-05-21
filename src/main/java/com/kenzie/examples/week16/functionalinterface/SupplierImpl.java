package com.kenzie.examples.week16.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierImpl implements Supplier<Integer> {
    @Override
    public Integer get() {
        Random random = new Random();
        int retInt = Integer.valueOf(random.nextInt(9));
        System.out.println(retInt);
        return retInt;
    }
}
