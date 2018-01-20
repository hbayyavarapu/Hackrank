package algorithms.codinginterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Check if the given string is a panagram & print all the missing characters in a sorted order
 */
public class Panagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString= "";
        inputString = in.nextLine().toLowerCase();
        String withOutSpace = removeSpace(inputString);
        System.out.println(withOutSpace);

        //Create an array of all the characters
        char alphabets[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //Put all the characters in the Map so get() is O(1)
        Map<Character, Character> alphaMap = new HashMap<>();
        for(int i = 0; i < alphabets.length; i++) {
            alphaMap.put(alphabets[i], alphabets[i]);
        }

        StringBuffer sb = new StringBuffer();
        //Compare the input string to map and see if there are any missing characters, if they are missing
        // add it to the StringBuffer
        for(char ch: alphaMap.keySet()) {
            if(!withOutSpace.contains(String.valueOf(ch))) {
                sb.append(ch);
            }

        }

        if(sb.length() == 0) {
            System.out.println("NULL");
        } else {
            //Sort the String Buffer string in ascending order using Arrays.sort()
            Arrays.sort(sb.toString().toCharArray());
            System.out.println(sb.toString());
        }
    }

    public static String removeSpace(String str) {
        char[] strArray = str.toCharArray();
        StringBuffer sb  = new StringBuffer();
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i] != ' ') {
                sb.append(strArray[i]);
            }
        }
        return sb.toString();
    }
}
