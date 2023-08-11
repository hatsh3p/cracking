package ComparisonSorts;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i]; // Copy
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) { // Move (loop)
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = temp; // Copy back
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
