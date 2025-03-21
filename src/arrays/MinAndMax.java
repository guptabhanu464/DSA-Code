package arrays;

import java.util.Arrays;

public class MinAndMax {

    public static void main(String[] args) {


        // Brute approach
        int[] arr = {3, 2, 1, 56, 10000, 167};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        findMinMax(arr);

    }

    // Optimal Approach

    public static void findMinMax(int [] arr) {

        int min = arr[0],max = arr[0];

        for(int i = 1 ; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);


    }


}
