package arrays;

import java.util.Arrays;

public class TwoSum2 {

    public static void main(String[] args) {

        int[] arr = {2,7,11,12};
        // Target 19
        // Well the index are {0,3}
        // But we need to return {1,4}
        // Array is already sorted
        int target = 19;
        int[] res = twoSum2(arr,target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum2(int[] nums , int target) {
        // 2 pointer approach
        int n = nums.length;

        int left = 0;
        int right = n -1;
        // Time Complexity - O(n)
        // Space Complexity - O(1)
        while(left<right) {

            int sum = nums[left]+nums[right];

            if(sum == target) {
                return new int[]{left+1,right+1};
            } if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
