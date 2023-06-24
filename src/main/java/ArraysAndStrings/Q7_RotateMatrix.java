package ArraysAndStrings;

import java.util.Arrays;

/**
 * Problem: Given an N x N matrix, write a method to rotate the matrix
 * by 90 degrees. Can you do this in place?
 *
 * TODO: Review easier 2D matrices and return to this question.
 */
public class Q7_RotateMatrix {
    /**
     * Solution 1: Brute force using extra space.
     *
     *      Time Complexity:     O(N**2)
     *      Space Complexity:    O(arr.length**2)
     *
     */
    public static int[][] bruteRotate(int[][] arr) {
        int n = arr.length;
        int[][] rotatedArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedArr[n - j - 1][i] = arr[i][j]; // <-- difficult to derive on the spot.
            }
        }
        return rotatedArr;
    }

    /**
     * Solution 2: In place algorithm.
     *
     * When rotating by 90 degrees:
     * The first row of the input matix becomes the first column of the output matrix in reverse.
     * The last row of the input matrix becomes the last column of the output matrix in reverse.
     *
     * The transpose is the flipped version of the matrix.
     * TO GET THE TRANSPOSE, SWITCH i and j.
     *
     * Get the transpose of the input matrix. In the transpose:
     * The first row of the input = the first column of the output.
     * The last row of the output = the last column of the output.
     *
     *      Matrix              Transpose           Rotated by 90 Counterclockwise
     *      1   2   3           1   4   7           3   6   9
     *      4   5   6           2   5   8           2   5   8
     *      7   8   9           3   6   9           1   4   7
     */

    public static int[][] transpose(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        return arr;
    }

}
