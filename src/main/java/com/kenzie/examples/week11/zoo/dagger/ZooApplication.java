package com.kenzie.examples.week11.zoo.dagger;

import com.kenzie.examples.week11.zoo.ImprovedZooService;

public class ZooApplication {
    public static void main(String[] args) {
        ZooAppComponent dagger = DaggerZooAppComponent.create();
        ImprovedZooService zooService = dagger.provideZooService();
        zooService.addNewAnimal("Ring-Tailed Lemur");
        //...
    }
}
