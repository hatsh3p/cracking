package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static ArraysAndStrings.Q8_ZeroMatrix.*;
import static org.junit.jupiter.api.Assertions.*;

class Q8_ZeroMatrixTest {

    @Test
    void zeroMatrixTest() {
        int[][] initialArray = {{1, 2, 3, 4}, {4, 0, 6, 7}, {8, 9, 10, 11}};
        int[][] expectedArray = {{1, 0, 3, 4}, {0, 0, 0, 0}, {8, 0, 10, 11}};
        zeroMatrix(initialArray);
        assertTrue(Arrays.deepEquals(expectedArray, initialArray));
    }

    @Test
    void zeroOutRowTest() {
        int[][] initialArray = {{1, 2, 3, 4}, {4, 0, 6, 7}, {8, 9, 10, 11}};
        int[][] expectedArray = {{1, 2, 3, 4}, {0, 0, 0, 0}, {8, 9, 10, 11}};
        zeroOutRow(initialArray, 1);
        assertTrue(Arrays.deepEquals(expectedArray, initialArray));
    }

    @Test
    void zeroOutColTest() {
        int[][] initialArray = {{1, 2, 3, 4}, {4, 0, 6, 7}, {8, 9, 10, 11}};
        int[][] expectedArray = {{1, 0, 3, 4}, {4, 0, 6, 7}, {8, 0, 10, 11}};
        zeroOutCol(initialArray, 1);
        assertTrue(Arrays.deepEquals(expectedArray, initialArray));
    }
}