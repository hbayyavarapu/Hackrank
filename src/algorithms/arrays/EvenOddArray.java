package algorithms.arrays;

public class EvenOddArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 8, 11, 20, 15};
        int even = 0;
        int odd = arr.length - 1;
        while(even < odd) {
            while(arr[even] % 2 == 0 && even < odd) {
                even++;
            }
            while(arr[odd] % 2 == 1 && even < odd) {
                odd--;
            }
            if(even < odd) {
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
                even++;
                odd--;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
