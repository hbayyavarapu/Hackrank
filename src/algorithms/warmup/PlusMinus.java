package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by Harish.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        double positiveFrac;
        double negativeFrac;
        double zeroFrac;

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                countPositive++;
            } if(arr[i] < 0) {
                countNegative++;
            } if (arr[i] == 0) {
                countZero++;
            }
        }
        positiveFrac = countPositive/(double)n;
        negativeFrac = countNegative/(double)n;
        zeroFrac = countZero/(double)n;
        System.out.println(positiveFrac);
        System.out.println(negativeFrac);
        System.out.println(zeroFrac);
    }
}
