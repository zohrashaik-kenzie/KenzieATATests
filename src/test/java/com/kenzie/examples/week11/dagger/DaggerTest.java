package com.kenzie.examples.week11.dagger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaggerTest {

    @Test
    public void givenGeneratedComponent_whenBuildingCar_thenDependenciesInjected() {
        VehiclesComponent component = DaggerVehiclesComponent.create();

        Car carOne = component.buildCar();
        Car carTwo = component.buildCar();

        Assertions.assertNotNull(carOne);
        Assertions.assertNotNull(carTwo);
        Assertions.assertNotNull(carOne.getEngine());
        Assertions.assertNotNull(carTwo.getEngine());
        Assertions.assertNotNull(carOne.getBrand());
        Assertions.assertNotNull(carTwo.getBrand());
        Assertions.assertNotEquals(carOne.getEngine(), carTwo.getEngine());
        Assertions.assertEquals(carOne.getBrand(), carTwo.getBrand());
    }
}
