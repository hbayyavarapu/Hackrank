package algorithms.sorting;

import java.util.Arrays;

/**
 * Created by Harish
 */
public class QuickSort {
    public static void main(String [] args) {
        int[] arr = {12, 9, 7, 15, 10};
        int start = 0;
        int end = arr.length -1;
        quickSort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;

        for(int j = start; j < end-1; j++) {
            if(arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }

        }
        arr[end] = arr[i];
        arr[i] = pivot;
        return i;
    }
}
