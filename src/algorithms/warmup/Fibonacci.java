package algorithms.warmup;

/**
 * Created by Harish on 6/30/17.
 */
public class Fibonacci {
    public static void main(String[] args) {

        fib(10);

    }
    public static void fib(int n) {
        int a = 0;
        int b = 1;
        int c;
       /* while (n < 100) {
            c = a + b;
            a = b;
            b = c;
        }*/
       if( n == 0 ) {
           System.out.println(a);
       }
        System.out.println(a + "\n" + b);
       for(int i = 2; i < n; i++) {
           c = a + b;
           a = b;
           b = c;
           System.out.println(b);
       }
    }
}
