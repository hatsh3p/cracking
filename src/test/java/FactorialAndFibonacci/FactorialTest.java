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
        Assertions.assertEquals(1, Factorial.getFactorialIterative(0));
    }
    @Test
    void factorialOf1Recursive() {
        Assertions.assertEquals(1, Factorial.getFactorialIterative(1));
    }
    @Test
    void factorialOf3Recursive() {
        Assertions.assertEquals(6, Factorial.getFactorialIterative(3));
    }
    @Test
    void factorialOf5Recursive() {
        Assertions.assertEquals(120, Factorial.getFactorialIterative(5));
    }
}