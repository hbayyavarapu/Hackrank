package algorithms.codinginterview;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
    public static boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<>();
        for(char c: expression.toCharArray()) {
            if(c == '[' || c == '{' || c == '(') {
                s.push(c);
            } else if(c == ']'){
                if(s.isEmpty() || s.pop() != '[') {
                    return false;
                }
            } else if(c == '}') {
                if(s.isEmpty() || s.pop() != '{') {
                    return false;
                }
            } else if(c == ')') {
                if(s.isEmpty() || s.pop() != '(') {
                    return false;
                }
            }

        }

        return s.isEmpty();
    }
}
