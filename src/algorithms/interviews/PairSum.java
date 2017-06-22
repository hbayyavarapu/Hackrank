package algorithms.interviews;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Harish on 6/18/17.
 */
public class PairSum {

    public static void main(String[] args) {
        int a[] = {8, 11, 10, 5, 3, 2};
        int b = 13;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            map.put(a[i], a[i]);
        }
        for(int i = 0; i < a.length; i++) {
            if(map.containsKey(b - a[i])) {
                System.out.println(a[i] + "," + (b-a[i]));
                map.remove(a[i]);
            }
        }

    }
}
