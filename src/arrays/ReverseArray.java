package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 6, 5};
        int[] revArr =  reverseArray(arr);
        System.out.println(Arrays.toString(revArr));
        // We will be swapping the elements till the mid
        // 1 -> 5
        // 4 -> 6
        // 3 -> 2

        // output = 562341

    }

    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
}
