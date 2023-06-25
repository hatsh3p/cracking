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
     * The first row of the input matrix becomes the first column of the output matrix in reverse.
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
        //System.out.println(Arrays.deepToString(arr));
        int[][] transposed = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposed[i][j] = arr[j][i];
            }
        }
        return transposed;
    }

    public static int[][] transposeInPlace(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    public static int[][] reverseCol(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length / 2; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[row][arr[row].length - 1 - col];
                arr[row][arr[row].length - 1 - col] = temp;
            }
        }
        return arr;
    }

    public static int[][] reverseRow(int[][] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            // switch the row only (i)
            int[] temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.deepToString(arr));
        return arr;
    }

    public static int[][] rotate90(int[][] arr) {
        arr = transpose(arr);
        return reverseRow(arr);
    }
}
