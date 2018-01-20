package algorithms.arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findKthSmallest(arr, 1));
    }

    public static int findKthSmallest(int a[], int k) {

        PriorityQueue<Integer> q = new PriorityQueue<>(k, Collections.reverseOrder());
        for(int i: a) {
            q.offer(i);
            if(q.size() > k) {
                q.poll();
            }
        }
        return q.peek();
    }
}
