package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void calculator_add_method_test_both_positive_arguments(){
        Calculator calc = new Calculator();
        int result = calc.add(10,12);
        assertEquals(result,22);
        assertTrue(result == 22);
    }

    @Test
    void calculator_add_method_test_both_negative_arguments(){
        Calculator calc = new Calculator();
        int op1 = -10;
        int op2 = -12;

        int result = calc.add(op1,op2);
        assertEquals(result,-22);
    }

    @Test
    void divide_method_happy_path_testing(){
        Calculator calc = new Calculator();
        assertEquals(  calc.divide(120.0f,10.0f), 12.0f);
    }



}
