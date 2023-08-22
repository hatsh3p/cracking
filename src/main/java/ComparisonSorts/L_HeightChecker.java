package ComparisonSorts;

import java.util.Arrays;

// Given: int[] heights (current order).
// Return number of indices where height[i] != expected[i].
public class L_HeightChecker {
    public static int heightChecker(int [] heights) {
        int outoforder = 0;
        int[] expected = Arrays.copyOf(heights, heights.length);
        sort(expected);
        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) {
                ++outoforder;
            }
        }
        return outoforder;
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        //      order = {60, 65, 72, 75, 80}, outoforder = 4
        int[] heights = {80, 60, 72, 65, 75};
        System.out.println(heightChecker(heights));
    }
}
