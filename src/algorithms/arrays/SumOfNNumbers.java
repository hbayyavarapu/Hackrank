package algorithms.arrays;

public class SumOfNNumbers {

    public static void main(String[] args) {

        int n = 4;
        int a[] = {1, 2, 5, 4};
        int sumOfNumbers = (5 * (5 +1))/2;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a[i];
        }

        int missingNumber = sumOfNumbers - sum;
        System.out.println(missingNumber);
    }
}
