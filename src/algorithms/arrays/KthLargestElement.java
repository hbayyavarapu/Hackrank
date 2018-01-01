package algorithms.arrays;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findKthLargest(arr, 1));
    }

    public static int findKthLargest(int a[], int k) {

        PriorityQueue<Integer> q = new PriorityQueue<>(k);
        for(int i: a) {
            q.offer(i);
            if(q.size() > k) {
                q.poll();
            }
        }
        return q.peek();
    }
}
