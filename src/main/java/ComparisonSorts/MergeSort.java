package ComparisonSorts;

import java.util.Arrays;

public class MergeSort {
    public static void mergesort(int[] arr) {
        if (arr.length > 1) {
            int[] left = get_left(arr);
            int[] right = get_right(arr);
            mergesort(left);
            mergesort(right);
            merge(arr, left, right);
        }
    }

    // Returns a copy of the array from 0 to mid.
    private static int[] get_left(int[] arr) {
        return Arrays.copyOfRange(arr, 0, arr.length/2);
    }

    // Returns a copy of the array from mid + 1 to end.
    private static int[] get_right(int[] arr) {
        return Arrays.copyOfRange(arr, arr.length/2, arr.length);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int left_index = 0;
        int right_index = 0;
        int arr_index = 0;

        while (left_index < left.length && right_index < right.length) {
            if (right[right_index] > left[left_index]) {
                arr[arr_index] = left[left_index++];
            } else {
                arr[arr_index] = right[right_index++];
            }
            arr_index++;
        }

        while (left_index < left.length) {
            arr[arr_index] = left[left_index++];
            arr_index++;
        }

        while (right_index < right.length) {
            arr[arr_index] = right[right_index++];
            arr_index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 17, 52, 18, 6, 30};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
