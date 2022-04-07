package com.kenzie.examples.week11.zoo;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DynamoDbClientProvider {

    private static String dynamodbEndpoint="http://dynamodb.us-east-1.amazonaws.com";
    private static String awsRegion="us-east-1";
    private static String dynamodbAccessKey="AKIAU6SDZFUG7MXERYCL";
    private static String dynamodbSecretKey="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";

    @Provides
    @Singleton
    public static DynamoDBMapper provideDynamoDBClient(){
        return new DynamoDBMapper(buildAmazonDynamoDB());
    }

    private static AmazonDynamoDB buildAmazonDynamoDB() {
        return AmazonDynamoDBClientBuilder
                .standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration(dynamodbEndpoint,awsRegion))
                .withCredentials(new AWSStaticCredentialsProvider(
                        new BasicAWSCredentials(dynamodbAccessKey,dynamodbSecretKey)))
                .build();
    }
}
