package com.kenzie.examples.week11.dagger;


import javax.inject.Inject;

public class Brand {
    String brandName;

    @Inject
    public Brand(String brandName) {
        this.brandName = brandName;
    }
}
