package com.kenzie.examples.week11.zoo;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

// DynamoDbAnimlDao.java
public class DynamoDbAnimalDao {
    private DynamoDBMapper dynamoDBMapper;
    public DynamoDbAnimalDao() {
        // DEPENDENCY ALERT!
        this.dynamoDBMapper =
             DynamoDbClientProvider.provideDynamoDBClient();
    }
    public void save(Animal animal) {
        this.dynamoDBMapper.save(animal);
    }
}
