package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by Harish
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i =0; i <n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print((i < (n- j)) ? " " : "#");
            }
            System.out.println("");
        }
    }
}
