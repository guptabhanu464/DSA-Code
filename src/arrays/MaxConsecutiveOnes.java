package arrays;

import java.util.Arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        int[] arr = {1,0,1,1,0,1};
        int res = maxConsecutiveOne(arr);
        System.out.println(res);


    }

    // We can't sort if we sort we will the consecutive ones
    public static int maxConsecutiveOne(int[] arr) {

        int val = 0;
        int max = 0;
        for (int j : arr) {
            if (j == 1) {
                val++;
                max = Math.max(max,val);
            } else {
                val = 0;
            }

        }
        return max;
    }
}
