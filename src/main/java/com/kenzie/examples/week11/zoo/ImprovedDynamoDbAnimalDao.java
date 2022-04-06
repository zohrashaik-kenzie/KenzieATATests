package com.kenzie.examples.week11.zoo;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class ImprovedDynamoDbAnimalDao {
    // DynamoDbAnimalDao.java
// Utilizes the dependency inversion principle
    private DynamoDBMapper dynamoDbMapper;
    // Take a look at the implementation in provideDynamoDbAnimalDao and match it to this constructor
    public ImprovedDynamoDbAnimalDao(DynamoDBMapper dynamoDbMapper) {
        this.dynamoDbMapper = dynamoDbMapper;
    }
}
