package MultiDimArrays;

public class RotateMatrix {
    /**
     * The transpose of a matrix flips the matrix on its diagonal OR can
     * be thought of as switching the indices of the columns and rows.
     *      Matrix                   Transpose
     *      [1, 2, 3]                [1, 4, 7]
     *      [4, 5, 6]                [2, 5, 8]
     *      [7, 8, 9]                [3, 6, 9]
     */
    public static void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix[j][i];
            }
        }
    }

    /**
     *      Matrix                   Flipped Horizontal
     *      [1, 2, 3]                [7, 8, 9]
     *      [4, 5, 6]                [4, 5, 6]
     *      [7, 8, 9]                [1, 2, 3]
     */
    public static void flipHorizontal(int[][] matrix) {

    }

    /**
     *      Matrix                   Flipped Vertical
     *      [1, 2, 3]                [3, 2, 1]
     *      [4, 5, 6]                [6, 5, 4]
     *      [7, 8, 9]                [3, 2, 1]
     */
    public static void flipVertical(int[][] matrix) {

    }

    /**
     *      Matrix                   Rotated 90 Clockwise
     *      [1, 2, 3]                [7, 4, 1]
     *      [4, 5, 6]                [8, 5, 2]
     *      [7, 8, 9]                [9, 6, 3]
     */
    public static void rotate90Clockwise(int[][] matrix) {

    }

    /**
     *      Matrix                   Rotated 90 Counterclockwise
     *      [1, 2, 3]                [3, 6, 9]
     *      [4, 5, 6]                [2, 5, 8]
     *      [7, 8, 9]                [1, 4, 7]
     */
    public static void rotate90CounterClockwise(int[][] matrix) {

    }

    public static String stringifyMatrix(int[][] matrix) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    stringBuilder.append('[');
                }
                stringBuilder.append(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    stringBuilder.append(", ");
                }
                if (j == matrix.length - 1) {
                    stringBuilder.append(']');
                }
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
