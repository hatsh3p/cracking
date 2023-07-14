package MultiDimArrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {
    int[][] matrix;

    @BeforeEach
    void setUp() {
        matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }

    @Test
    void transpose() {
        RotateMatrix.transpose(matrix);
        System.out.println(RotateMatrix.stringifyMatrix(matrix));
        int[][] transposedMatrix = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Assertions.assertEquals(transposedMatrix, matrix);
    }
}