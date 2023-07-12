package FactorialAndFibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {
    @Test
    void factorialOf0Iterative() {
        Assertions.assertEquals(1, Factorial.getFactorialIterative(0));
    }
    @Test
    void factorialOf1Iterative() {
        Assertions.assertEquals(1, Factorial.getFactorialIterative(1));
    }
    @Test
    void factorialOf3Iterative() {
        Assertions.assertEquals(6, Factorial.getFactorialIterative(3));
    }
    @Test
    void factorialOf5Iterative() {
        Assertions.assertEquals(120, Factorial.getFactorialIterative(5));
    }

    @Test
    void factorialOf0Recursive() {
        Assertions.assertEquals(1, Factorial.getFactorialRecursive(0));
    }
    @Test
    void factorialOf1Recursive() {
        Assertions.assertEquals(1, Factorial.getFactorialRecursive(1));
    }
    @Test
    void factorialOf3Recursive() {
        Assertions.assertEquals(6, Factorial.getFactorialRecursive(3));
    }
    @Test
    void factorialOf5Recursive() {
        Assertions.assertEquals(120, Factorial.getFactorialRecursive(5));
    }

    @Test
    void factorialOf0Dynamic() {
        Assertions.assertEquals(1, Factorial.getFactorialDynamic(0));
    }
    @Test
    void factorialOf1Dynamic() {
        Assertions.assertEquals(1, Factorial.getFactorialDynamic(1));
    }
    @Test
    void factorialOf3Dynamic() {
        Assertions.assertEquals(6, Factorial.getFactorialDynamic(3));
    }
    @Test
    void factorialOf5Dynamic() {
        Assertions.assertEquals(120, Factorial.getFactorialDynamic(5));
    }
}