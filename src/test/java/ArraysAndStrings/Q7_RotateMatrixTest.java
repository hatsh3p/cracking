package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static ArraysAndStrings.Q7_RotateMatrix.*;
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
        transpose(initialArray);
        assertTrue(Arrays.deepEquals(transposedArray, transpose(initialArray)));
    }

    @Test
    void transposeInPlaceTest() {
        int[][] initialArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transposedArray = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assertTrue(Arrays.deepEquals(transposedArray, transposeInPlace(initialArray)));
    }

    @Test
    void reverseColInPlaceTest() {
        int[][] initialArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] reversedArray = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};

        assertTrue(Arrays.deepEquals(reversedArray, reverseCol(initialArray)));
    }

    @Test
    void reverseRowInPlaceTest() {
        int[][] initialArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] reversedArray = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};

        assertTrue(Arrays.deepEquals(reversedArray, reverseRow(initialArray)));
    }

    @Test
    void rotate90Test() {
        int[][] initialArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedArray = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
        assertTrue(Arrays.deepEquals(rotatedArray, rotate90(initialArray)));
    }
}