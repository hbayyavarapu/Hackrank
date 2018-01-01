package algorithms.arrays;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximiseSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Get K negations: ");
        int k = sc.nextInt();
        System.out.println(maxSum(arr, k));
    }

    public static int maxSum(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: a) {
            pq.offer(i);
        }

        while(k-- > 0) {
            int temp = pq.poll();

            temp *= -1;
            pq.add(temp);
        }

        int sum = 0;
        for(int x: pq) {
            sum += x;
        }
        return sum;
    }
}
