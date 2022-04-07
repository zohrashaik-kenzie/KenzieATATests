package com.kenzie.examples.week11.dagger;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class VehiclesModule {



    @Provides
    @Singleton
    public Brand provideBrand() {
        return new Brand("Test");
    }
}
