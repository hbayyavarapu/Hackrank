package algorithms.codinginterview;

import java.util.Scanner;

public class Anagrams {
    public static int numberNeeded(String first, String second) {
        int[] lettercounts = new int[26];
        System.out.println(first.toCharArray()[0] - 'a');
        for(char c : first.toCharArray()){
            lettercounts[c-'a']++;
        }
        for(char c : second.toCharArray()){
            lettercounts[c-'a']--;
        }
        int result = 0;
        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
