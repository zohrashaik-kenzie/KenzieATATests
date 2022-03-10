package com.kenzie.examples.mockito.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;


public class MathApplicationTester {
    @Mock
    CalculatorService calcService;

    @InjectMocks
    MathApplication mathApplication;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
     }

    @Test
    public void testAdd(){
        //add the behavior of calc service to add two numbers
        when(calcService.add(10.0,20.0)).thenReturn(30.00);
        when(calcService.add(5.0,20.0)).thenReturn(25.00);
        when(calcService.add(20.0,20.0)).thenReturn(40.00);

        //test the add functionality
        Assertions.assertEquals(mathApplication.add(20.0, 20.0),40.00,0);
        Assertions.assertEquals(mathApplication.add(20.0, 20.0),40.00,0);

        //verify call to calcService is made or not with same arguments.
        //verify(calcService).add(20.0, 20.0);

        verify(calcService, times(2)).add(20.0, 20.0);
        //
        //      //verify that method was never called on a mock
             verify(calcService, never()).multiply(10.0,20.0);
        //
    }

    @Test
    public void testSubtract() {

        when(calcService.subtract(20.0,10.0)).thenReturn(10.0);
        Assertions.assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0);


    }

    @Test
    public void testException(){
        //add the behavior of calc service to add two numbers
        when(calcService.add(10.0,-1)).thenThrow(IllegalArgumentException.class);

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> mathApplication.add(10.0,-1));
    }


    @Test
    public void testAddSub(){
        //add the behavior of calc service to add two numbers
        when(calcService.add(10.0,20.0)).thenReturn(30.00);

        //add the behavior of calc service to subtract two numbers
        when(calcService.subtract(20.0,10.0)).thenReturn(10.00);

        //test the add functionality thrice

        //test the subtract functionality once

        //check a minimum 1 call count
        verify(calcService, atLeastOnce()).subtract(20.0, 10.0);

        //check if add function is called minimum 2 times
        verify(calcService, atLeast(2)).add(10.0, 20.0);

        //check if add function is called maximum 3 times
        verify(calcService, atMost(3)).add(10.0,20.0);
    }
}