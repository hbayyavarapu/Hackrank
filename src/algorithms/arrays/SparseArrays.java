package algorithms.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> sArrays = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int total = 1;
            String str = sc.next();
            if(sArrays.containsKey(str.trim())) {
                sArrays.put(str, sArrays.get(str) + 1);
            } else {
                sArrays.put(str, total);
            }
        }

        int query = sc.nextInt();
        for(int i = 0; i < query; i++) {
            String key = sc.next();
            if(sArrays.containsKey(key)) {
                System.out.println(sArrays.get(key));
            } else {
                System.out.println(0);
            }
        }
    }
}
