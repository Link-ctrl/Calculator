package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAddition() {
        assertEquals(5, calculatorService.calculate(2, 3, "add"));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculatorService.calculate(3, 2, "subtract"));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculatorService.calculate(2, 3, "multiply"));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculatorService.calculate(6, 3, "divide"));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                calculatorService.calculate(6, 0, "divide")
        );
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

    @Test
    void testInvalidOperation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                calculatorService.calculate(6, 3, "invalid")
        );
        assertEquals("Invalid operation: invalid", exception.getMessage());
    }
}
