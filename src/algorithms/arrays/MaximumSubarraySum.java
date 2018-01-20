package algorithms.arrays;

/**
 * Find out the maxium subarray sum in a given array
 */
public class MaximumSubarraySum {
    public static void main(String[] args) {
        //int[] a = {7, 2, 3, 10, 2, 4, 8, 1};
        int[] a = {6, 7, 9, 5, 6, 3, 2};
//        solveByNaive(a);
//        divideAndConquer(a);
//        KadensAlgo(a);
        solveByNaiveDifference(a);

    }


    // O(N^2)
    public static void  solveByNaive(int[] a) {
        int maxSumSoFar = 0;
        for(int i = 0; i < a.length; i++) {
            int sum = 0;
            for(int j = i; j < a.length; j++) {
                sum += a[j];
                if(sum > maxSumSoFar) {
                    maxSumSoFar = sum;
                }
            }
        }
        System.out.println(maxSumSoFar);
    }

    // O(N^2)
    public static void  solveByNaiveDifference(int[] a) {
        int difference = a[1] - a[0];
        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = i + 1; j < a.length; j++)
            {
                if (a[j] - a[i] > difference)
                    difference = a[j] - a[i];
            }
        }
        System.out.println(difference);
    }

    // Divide & Conquer approach in O(Nlog N) performance
    public static void  divideAndConquer(int[] a) {
        int l = 0;
        int h = a.length - 1;
        System.out.println(maxSubArrayDivision(a, l, h));
    }

    public static int maxSumCrossing(int[] a, int l, int m, int h) {
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for(int i = m; i >= l; i--) {
            sum = sum + a[i];
            if( sum > left_sum) {
                left_sum = sum;
            }
        }

        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for(int i = m+1; i <= h; i++) {
            sum = sum + a[i];
            if(sum > right_sum)
                right_sum = sum;
        }

        return left_sum + right_sum;
    }

    public static int maxSubArrayDivision(int[] a, int l, int h) {

        if( l == h ) {
            return a[l];
        }

        int m = l + (h -l)/2;

        return Math.max(Math.max(maxSubArrayDivision(a, l, m),
                maxSubArrayDivision(a, m+1, h)), maxSumCrossing(a, l, m, h));

    }

    public static int KadensAlgo(int[] a) {

        return 0;

    }
}
