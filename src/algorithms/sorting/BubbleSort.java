package algorithms.sorting;

/**
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {100, 2, 5, 8, 23, 7, 9, 12, 16};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
