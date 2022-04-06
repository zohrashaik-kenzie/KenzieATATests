package com.kenzie.examples.week11.zoo;

// ZooZervice.java
public class ZooService {
    private DynamoDbAnimalDao animalDao;
    private DisplayService displayService;
    public ZooService() {
        // DEPENDENCY ALERT!
        this.animalDao = new DynamoDbAnimalDao();
        //
        // DEPENDENCY ALERT!
        this.displayService = new DisplayService();
    }
    public void addNewAnimal(String animalType) {
        //  Create and save new animal with the type passed into the method
        Animal animal = new Animal(animalType);
        animalDao.save(animal);
    }
}
