package ComparisonSorts;

import java.util.Arrays;

public class BubbleSort {
    // Algorithm:
    // Loop through the entire array
    // Inner loop swapping if left value > right value.
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {20, 17, 52, 18, 6, 30};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
