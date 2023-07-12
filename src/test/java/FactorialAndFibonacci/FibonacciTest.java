package FactorialAndFibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void getFibonacciOf1Dynamic() {
        Assertions.assertEquals(0, Fibonacci.getFibonacciDynamic(1));
    }
    @Test
    void getFibonacciOf2Dynamic() {
        Assertions.assertEquals(1, Fibonacci.getFibonacciDynamic(2));
    }
    @Test
    void getFibonacciOf3Dynamic() {
        Assertions.assertEquals(1, Fibonacci.getFibonacciDynamic(3));
    }
    @Test
    void getFibonacciOf4Dynamic() {
        Assertions.assertEquals(2, Fibonacci.getFibonacciDynamic(4));
    }
    @Test
    void getFibonacciOf5Dynamic() {
        Assertions.assertEquals(3, Fibonacci.getFibonacciDynamic(5));
    }
    @Test
    void getFibonacciOf6Dynamic() {
        Assertions.assertEquals(5, Fibonacci.getFibonacciDynamic(6));
    }
    @Test
    void getFibonacciOf7Dynamic() {
        Assertions.assertEquals(8, Fibonacci.getFibonacciDynamic(7));
    }
    @Test
    void getFibonacciOf8Dynamic() {
        Assertions.assertEquals(13, Fibonacci.getFibonacciDynamic(8));
    }

    @Test
    void getFibonacciOf1Recursive() {
        Assertions.assertEquals(0, Fibonacci.getFibonacciRecursive(1));
    }
    @Test
    void getFibonacciOf2Recursive() {
        Assertions.assertEquals(1, Fibonacci.getFibonacciRecursive(2));
    }
    @Test
    void getFibonacciOf3Recursive() {
        Assertions.assertEquals(1, Fibonacci.getFibonacciRecursive(3));
    }
    @Test
    void getFibonacciOf4Recursive() {
        Assertions.assertEquals(2, Fibonacci.getFibonacciRecursive(4));
    }
    @Test
    void getFibonacciOf5Recursive() {
        Assertions.assertEquals(3, Fibonacci.getFibonacciRecursive(5));
    }
    @Test
    void getFibonacciOf6Recursive() {
        Assertions.assertEquals(5, Fibonacci.getFibonacciRecursive(6));
    }
    @Test
    void getFibonacciOf7Recursive() {
        Assertions.assertEquals(8, Fibonacci.getFibonacciRecursive(7));
    }
    @Test
    void getFibonacciOf8Recursive() {
        Assertions.assertEquals(13, Fibonacci.getFibonacciRecursive(8));
    }

    @Test
    void getFibonacciOf1Iterative() {
        Assertions.assertEquals(0, Fibonacci.getFibonacciIterative(1));
    }
    @Test
    void getFibonacciOf2Iterative() {
        Assertions.assertEquals(1, Fibonacci.getFibonacciIterative(2));
    }
    @Test
    void getFibonacciOf3Iterative() {
        Assertions.assertEquals(1, Fibonacci.getFibonacciIterative(3));
    }
    @Test
    void getFibonacciOf4Iterative() {
        Assertions.assertEquals(2, Fibonacci.getFibonacciIterative(4));
    }
    @Test
    void getFibonacciOf5Iterative() {
        Assertions.assertEquals(3, Fibonacci.getFibonacciIterative(5));
    }
    @Test
    void getFibonacciOf6Iterative() {
        Assertions.assertEquals(5, Fibonacci.getFibonacciIterative(6));
    }
    @Test
    void getFibonacciOf7Iterative() {
        Assertions.assertEquals(8, Fibonacci.getFibonacciIterative(7));
    }
    @Test
    void getFibonacciOf8Iterative() {
        Assertions.assertEquals(13, Fibonacci.getFibonacciIterative(8));
    }
}