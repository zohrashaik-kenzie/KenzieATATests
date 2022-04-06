package com.kenzie.examples.week11.zoo;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class ZooAppHelper {
    public ImprovedZooService provideZooService() {
        // Calls the method below in a waterfall-like instantiation
        return new ImprovedZooService(provideDynamoDbAnimalDao());
    }

    private ImprovedDynamoDbAnimalDao provideDynamoDbAnimalDao() {
        // Calls the method below in a waterfall-like instantiation
        return new ImprovedDynamoDbAnimalDao(provideDynamoDBMapper());
    }
    private DynamoDBMapper provideDynamoDBMapper() {
        // Calls the method below in a waterfall-like instantiation
        return new DynamoDBMapper((AmazonDynamoDB) DynamoDbClientProvider.provideDynamoDBClient());
    }
    private Regions getRegion() {
        // Some logic
        return null;
    }
}