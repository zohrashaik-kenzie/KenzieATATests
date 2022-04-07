package com.kenzie.examples.week11.zoo;

import javax.inject.Inject;

public class ImprovedZooService {
    private ImprovedDynamoDbAnimalDao animalDao;
    private DisplayService displayService;
    // Take a look at the implementation in provideZooService and match it to this constructor

    @Inject
    public ImprovedZooService(ImprovedDynamoDbAnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    public void addNewAnimal(String animalType) {
        //  Create and save new animal with the type passed into the method
        Animal animal = new Animal(animalType);
        animalDao.save(animal);
    }

}
