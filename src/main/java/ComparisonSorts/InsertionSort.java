package ComparisonSorts;

import java.util.Arrays;

public class InsertionSort {
    // Consider the first element in the array "sorted".
    // Loop through the rest of the array, inserting the current in the appropriate
    // position in the "sorted" part of the array and copying elements as needed.
    public static void sort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentIndex = i;
            while (currentIndex > 0 && arr[currentIndex - 1] > arr[currentIndex]) {
                // Swap elements that are out of order.
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex - 1];
                arr[currentIndex - 1] = temp;
                currentIndex--;
            }
        }
    }

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
