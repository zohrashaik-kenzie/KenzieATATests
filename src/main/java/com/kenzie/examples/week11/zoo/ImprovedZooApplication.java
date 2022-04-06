package com.kenzie.examples.week11.zoo;

public class ImprovedZooApplication {
    public static void main(String[] args) {
        // provideZooService does the cascade call above that magically instantiates everything
        ImprovedZooService zooService = new ZooAppHelper().provideZooService();
    }
}
