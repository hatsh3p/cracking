package ArraysAndStrings;

import java.util.Arrays;

/**
 * Problem: Write an algorithm such that if an element in an M x N
 * matrix == 0, its entire row and column are set to zero.
 *
 *      Input:                  Output:
 *      {{ 1, 2, 3, 0, 4},      {{ 0, 0, 0, 0, 0},
 *       { 5, 6, 7, 8, 9},       { 5, 6, 7, 0, 9},
 *       {10,11,12,13,14}}       {10,11,12, 0,14}}
 */
public class Q8_ZeroMatrix {
    /**
     * Solution 1: This is a narrow interpretation that assumes only one
     * zero appears.
     *      Time Complexity:    O(N**2)
     *      Space Complexity:   O(1)
     */
    public static void zeroMatrix(int[][] arr) {
        int zero_i = -1, zero_j = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    zero_i = i;
                    zero_j = j;
                    break;
                }
            }
        }
        zeroOutRow(arr, zero_i);
        zeroOutCol(arr, zero_j);
    }

    public static void zeroOutRow(int[][] arr, int row) {
        for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = 0;
        }
    }

    public static void zeroOutCol(int[][] arr, int col) {
        for (int row = 0; row < arr.length; row++) {
            arr[row][col] = 0;
        }
    }

    /**
     * Solution 2: True to CTCI, assume multiple zeroes may appear.
     * To avoid the problem of not knowing if a zero is an original
     * zero or a zeroed out zero, when looping use the original
     * array and when changing use the results array.
     *      Time Complexity:    O(N**2)
     *      Space Complexity:   O(1)
     */
    public static int[][] multipleZeroMatrix(int[][] arr) {
        int[][] zeroMatrix = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                zeroMatrix[i][j] = arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    zeroOutRow(zeroMatrix, i);
                    zeroOutCol(zeroMatrix, j);
                }
            }
        }
        System.out.println(Arrays.deepToString(zeroMatrix));
        return zeroMatrix;
    }
}
