package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static ArraysAndStrings.Q8_ZeroMatrix.*;
import static org.junit.jupiter.api.Assertions.*;

class Q8_ZeroMatrixTest {

    @Test
    void zeroMatrix_Matrix_ZeroMatrix() {
        int[][] initialArray = {{1, 2, 3, 4}, {4, 0, 6, 7}, {8, 9, 10, 11}};
        int[][] expectedArray = {{1, 0, 3, 4}, {0, 0, 0, 0}, {8, 0, 10, 11}};
        zeroMatrix(initialArray);
        assertTrue(Arrays.deepEquals(expectedArray, initialArray));
    }

    @Test
    void zeroOutRow_Matrix_ZeroRow() {
        int[][] initialArray = {{1, 2, 3, 4}, {4, 0, 6, 7}, {8, 9, 10, 11}};
        int[][] expectedArray = {{1, 2, 3, 4}, {0, 0, 0, 0}, {8, 9, 10, 11}};
        zeroOutRow(initialArray, 1);
        assertTrue(Arrays.deepEquals(expectedArray, initialArray));
    }

    @Test
    void zeroOutCol_Matrix_ZeroCol() {
        int[][] initialArray = {{1, 2, 3, 4}, {4, 0, 6, 7}, {8, 9, 10, 11}};
        int[][] expectedArray = {{1, 0, 3, 4}, {4, 0, 6, 7}, {8, 0, 10, 11}};
        zeroOutCol(initialArray, 1);
        assertTrue(Arrays.deepEquals(expectedArray, initialArray));
    }

    @Test
    void multipleZeroMatrix_SingleZeroMatrix_ZeroMatrix() {
        int[][] initialArray = {{1, 2, 3, 4}, {4, 0, 6, 7}, {8, 9, 10, 11}};
        int[][] expectedArray = {{1, 0, 3, 4}, {0, 0, 0, 0}, {8, 0, 10, 11}};
        assertTrue(Arrays.deepEquals(expectedArray, multipleZeroMatrix(initialArray)));
    }

    @Test
    void multipleZeroMatrix_MultipleZeroMatrix_ZeroMatrix() {
        int[][] initialArray = {{1, 2, 3, 4}, {4, 0, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 0}};
        int[][] expectedArray = {{1, 0, 3, 0}, {0, 0, 0, 0}, {8, 0, 10, 0}, {0, 0, 0, 0}};
        assertTrue(Arrays.deepEquals(expectedArray, multipleZeroMatrix(initialArray)));
    }
}