package FactorialAndFibonacci;

/**
 * Problem: Write an iterative function that finds the factorial of a number.
 * Input: 3
 * Output: 3 * 2 * 1 = 6
 */
public class Factorial {
    /**
     * Solution: An iterative solution to finding the factorial, uses loops to
     * keep decrementing n and multiplies it by the result so far.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int getFactorialIterative(int n) {
        int factorial = 1; // The factorial of 0 or 1 = 1
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Solution: An recursive solution to finding the factorial.
     * Base case: n == 0 or n == 1
     * Recursive case: For all other values of n, return f(n - 1) * n.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int getFactorialRecursive(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * getFactorialIterative(n - 1);
        }
    }

    /**
     * Solution: A dynamic programming solution.
     * (1) Create a table.
     * (2) Seed the table.
     * (3) Use the table to make calculations.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int getFactorialDynamic(int n) {
        int[] factorialTable = new int[n + 1]; // need to fit 0 - n
        factorialTable[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            factorialTable[i] = factorialTable[i - 1] * i;
        }
        return factorialTable[n];
    }
}
