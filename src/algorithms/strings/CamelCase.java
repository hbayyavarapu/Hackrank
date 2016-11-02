package algorithms.strings;

import java.util.Scanner;

/**
 * Created by Harish.
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] charString = s.toCharArray();
        //Count is 1 because the the first word is counted in the total count
        int count = 1;
        for(char str: charString) {
            if(str - 32 < 65) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
