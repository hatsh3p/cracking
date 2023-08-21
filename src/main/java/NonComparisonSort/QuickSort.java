package NonComparisonSort;

import java.util.Arrays;

// AKA Counting Sort (which seems more appropriate).
public class QuickSort {
    public static void sort(int[] arr) {
        int[] count = new int[20]; // should be set to the max value of the array + 1;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            count[value]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] != 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 9, 9, 6, 2, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
