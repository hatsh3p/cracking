package ComparisonSorts;

import java.util.Arrays;

public class L_SortColors {
    // Given: int[] nums
    // Return: int[] nums sorted in place
    // Ordering relation: red (0), white (1), blue (2)

    // Solution 1: Accepted. Uses additional memory. O(N) runtime.
    public static void sortColors (int[] nums) {
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            int color = nums[i];
            count[color]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                --count[i];
                ++j;

            }
        }
    }

    public static void main(String[] args) {
        int[] colors = {2, 0, 1, 2, 2, 1, 0, 0};
        sortColors(colors);
        System.out.println(Arrays.toString(colors));
    }
}
