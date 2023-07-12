package FactorialAndFibonacci;

public class Fibonacci {
    /**
     * Solution 1: Recursive.
     * Simplest solution for fibonacci.
     * Base case 1: n == 1, return 0
     * Base case 2: n == 2, return 1
     * Recursive case: getFib(n-1) + getFib(n-2) i.e. sum of the fib of the next
     * two consecutive numbers.
     */
    public static int getFibonacciRecursive(int n) {
        if (n < 1) {
            throw new ArithmeticException();
        }
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return getFibonacciRecursive(n - 1) + getFibonacciRecursive(n - 2);
        }
    }

    /**
     * Solution 2: Dynamic
     * Use a table to store and calculate fibonacci.
     */
    public static int getFibonacciDynamic(int n) {
        if (n < 1) {
            throw new ArithmeticException();
        }
        if (n == 1) {
            return 0;
        }
        int[] fibonacciTable = new int[n + 1];
        fibonacciTable[0] = 0;
        fibonacciTable[1] = 0;
        fibonacciTable[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            fibonacciTable[i] = fibonacciTable[i - 1] + fibonacciTable[i - 2];
        }
        return fibonacciTable[n];
    }

    /**
     * Solution 3: Iterative
     * Use two variables to keep track of (n - 1) and (n - 2) and another as
     * a temporary variable.
     * Iterate from 3 to n adding the two previous numbers to get the nth num
     * in fibonacci.
     */
    public static int getFibonacciIterative(int n) {
        if (n < 1) {
            throw new ArithmeticException();
        }
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        // Iterative fibonacci is the sum of the two previous values.
        int n1 = 0;
        int n2 = 1;
        int temp;
        for (int i = 3; i < n + 1; i++) {
            temp = n1;
            n1 = n2;
            n2 = n1 + temp;
        }

        return n2;
    }
}
