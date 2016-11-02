package algorithms.sorting;

import java.util.Arrays;

/**
 * Created by Harish
 */
public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 23, 7, 9, 12, 16};
        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int arr[], int start, int end) {
        if(start < end) {
            int middle = (int)Math.floor((start + end)/2);
            mergeSort(arr, start, middle);
            mergeSort(arr, middle + 1, end);
            merge(arr, start, middle, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end) {
        int leftSize = mid-start + 1;
        int rightSize = end - mid;
        int[] left= new int[leftSize];
        int[] right = new int[rightSize];
        for(int i = 0; i < leftSize; i++) {
            left[i] = data[start + i];
        }
        for(int j = 0; j < rightSize; j++) {
            right[j] = data[mid + 1 + j];
        }

        int i = 0, j = 0;
        for(int k = start; k <= end; k++) {
            if ((j >= rightSize) || (i < leftSize && left[i] <= right[j])) {
                data[k] = left[i];
                i++;
            } else  {
                data[k] = right[j];
                j++;
            }
        }
    }
}

