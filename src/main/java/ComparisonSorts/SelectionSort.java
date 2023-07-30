package ComparisonSorts;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            swap(arr, i, findSmallest(arr, i + 1));
        }
    }

    public static int findSmallest(int[] arr, int start) {
        int smallest = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[smallest]) {
                smallest = i;
            }
        }
        return smallest;
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
