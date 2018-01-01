package algorithms.codinginterview;

import algorithms.sorting.MergeSort;

import java.util.*;

public class Median {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }


        Queue<Integer> min = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> max = new PriorityQueue<>();



        //Slow
        /*for(int i = 0; i < a.length; i++) {
            int[] temp = new int[i+1];
            for(int j = 0; j <= i; j++) {
                temp[j] = a[j];
            }
            System.out.println(findMedian(temp));
        }*/

    }

    //Slow
    /*public static float findMedian(int[] a) {
        int length = a.length;
        double median = 0.0;
        MergeSort.mergeSort(a, 0, a.length-1);
        if(length % 2 == 0) {
            median = ((float)length + 1.0)/2.0;
            int floor = new Double(Math.floor(median)).intValue();
            int ceil = new Double(Math.ceil(median)).intValue();
            return (float)(a[floor-1] + a[ceil-1])/2;

        } else {
            int m = (length + 1)/2;
            return (float)a[m-1];
        }

    }*/
}
