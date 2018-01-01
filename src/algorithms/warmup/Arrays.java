package algorithms.warmup;

import java.util.Scanner;

public class Arrays {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        String str = "";
        for(int j = arr.length - 1; j >= 0 ; j--) {
            str += arr[j] + " ";
        }
        System.out.println(str.trim());
    }
}
