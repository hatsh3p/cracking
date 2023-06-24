package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static ArraysAndStrings.Q7_RotateMatrix.bruteRotate;
import static ArraysAndStrings.Q7_RotateMatrix.transpose;
import static org.junit.jupiter.api.Assertions.*;

class Q7_RotateMatrixTest {

    @Test
    void bruteRotateTest() {
        int[][] initialArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedArray = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
        assertTrue(Arrays.deepEquals(rotatedArray, bruteRotate(initialArray)));
    }

    @Test
    void transposeTest() {
        int[][] initialArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transposedArray = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        //System.out.println(Arrays.deepToString(transpose(initialArray)));
        assertTrue(Arrays.deepEquals(transposedArray, transpose(initialArray)));
    }
}