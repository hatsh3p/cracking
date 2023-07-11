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
     */
    public static int getFactorialIterative(int n) {
        int factorial = 1; // The factorial of 0 or 1 = 1
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static int getFactorialRecursive(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * getFactorialIterative(n - 1);
        }
    }
}
