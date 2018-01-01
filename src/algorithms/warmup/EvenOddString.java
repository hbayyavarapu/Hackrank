package algorithms.warmup;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class EvenOddString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStr = sc.nextInt();
        List<String> strList = new ArrayList<>();
        int i = 0;
        while( i < totalStr) {
            strList.add(sc.next());
            i++;
        }

        for(String str: strList) {
            StringBuilder evenStr = new StringBuilder();
            StringBuilder oddStr = new StringBuilder();
            char[] c = str.toCharArray();
            for(int j = 0; j < c.length; j++) {
                if(j % 2 == 0) {
                    evenStr.append(c[j]);
                } else {
                    oddStr.append(c[j]);
                }

            }
            System.out.println(evenStr + " " + oddStr);

        }
        sc.close();

    }
}
