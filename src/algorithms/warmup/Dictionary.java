package algorithms.warmup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneDict = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneDict.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneDict.containsKey(s)) {
                System.out.println(s + "=" + phoneDict.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
