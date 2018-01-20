package algorithms.search;

import algorithms.sorting.MergeSort;

import java.util.Arrays;

/**
 * Created by Harish
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 23, 7, 9, 12, 16};
        int end = arr.length - 1;
        int target = 8;

        Arrays.sort(arr);
        //MergeSort.mergeSort(arr, 0, end);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        int result = binarySearch(arr, 0, end, target);
        if(result == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at : " + (result + 1));
        }

    }

    public static int binarySearch(int[] arr, int l, int r, int x) {
        if(r >= l) {
            int mid = l + (r - l)/2;

            if(x == arr[mid]) {
                return mid;
            } else if(x > arr[mid]) {
                return binarySearch(arr, mid+1, r, x);
            } else {
                return binarySearch(arr, l, mid-1, x);
            }

        }

        return -1;
    }
}
