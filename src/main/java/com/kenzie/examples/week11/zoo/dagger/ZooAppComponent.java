package com.kenzie.examples.week11.zoo.dagger;

import com.kenzie.examples.week11.zoo.ImprovedZooService;
import dagger.Component;
import com.kenzie.examples.week11.zoo.DynamoDbClientProvider;

import javax.inject.Singleton;

@Singleton
@Component(modules = { DynamoDbClientProvider.class })
public interface ZooAppComponent {
    ImprovedZooService provideZooService();
}

