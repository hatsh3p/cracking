package ArraysAndStrings;

import java.util.Arrays;

/**
 * Problem: Write an algorithm such that if an element in a M x N
 * matrix == 0, it's entire row and column are set to zero.
 *
 *      Input:                  Output:
 *      {{ 1, 2, 3, 0, 4},      {{ 0, 0, 0, 0, 0},
 *       { 5, 6, 7, 8, 9},       { 5, 6, 7, 0, 9},
 *       {10,11,12,13,14}}       {10,11,12, 0,14}}
 */
public class Q8_ZeroMatrix {
    /**
     * Solution 1:
     *      Time Complexity:
     *      Space Complexity:
     */
    public static void zeroMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    zeroOutRow(arr, i);
                    zeroOutCol(arr, j);
                    break;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
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
}
