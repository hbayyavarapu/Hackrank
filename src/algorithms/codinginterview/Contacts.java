package algorithms.codinginterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contacts {
    static Map<String, String> contactMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        String build = "";

        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();

            /*if(op.equalsIgnoreCase("add")) {
                addOrFind(contact, op);
            } else {
                addOrFind(contact, op);
            }*/
            if (op.equals("add")){
                for (int i = 0; i < contact.length(); i++){
                    build += contact.charAt(i);
                    if(map.containsKey(build)){
                        map.put(build, map.get(build) + 1);
                    } else {
                        map.put(build, 1);
                    }
                }
                build = "";

            } else if (op.equals("find")) {
                if (map.containsKey(contact)){
                    System.out.println(map.get(contact));
                } else {
                    System.out.println("0");
                }
            }

        }
    }

    /*public static void addOrFind(String name, String type) {
        if(type.equalsIgnoreCase("add")) {
            contactMap.put(name, name);
        } else {
            long count = contactMap.entrySet().stream()
                    .filter(p->p.getKey().contains(name)).count();
            System.out.println(count);
        }

    }*/


}
