package com.kenzie.examples.week11.zoo;

public class ImprovedZooService {
    private ImprovedDynamoDbAnimalDao animalDao;
    private DisplayService displayService;
    // Take a look at the implementation in provideZooService and match it to this constructor
    public ImprovedZooService(ImprovedDynamoDbAnimalDao animalDao) {
        this.animalDao = animalDao;
    }

}
