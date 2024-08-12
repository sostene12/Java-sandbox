package com.amigoscode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void canAddNumbers(){
        Calculator underTest = new Calculator();
        int[] numbers = { 1,2,4 };
        int result = underTest.add(numbers);
        assertEquals(7,result);
    }
}
