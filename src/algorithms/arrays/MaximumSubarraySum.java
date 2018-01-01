package algorithms.arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] a = {-2, -5, 6, -2, -3, 1, 5, -6};
        solveByNaive(a);
        divideAndConquer(a);
        KadensAlgo(a);
    }

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
