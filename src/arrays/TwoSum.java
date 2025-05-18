package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2,5,5,11};

        int[] result;
        result = twoSumOptimized(arr , 10);

        System.out.println(Arrays.toString(result));

    }

    // Brute Force - Time Taken o(n^2)
    // Two Inner Loops which will go till n
    // Space Complexity - o(1)
    public static int[] twoSum(int[] nums , int target) {

        for(int i = 0 ; i < nums.length ; i++) {

            for (int j = i+1 ; j < nums.length ; j++) {

                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }

        return new int[]{};
    }


    // Optimized Approach - Time Complexity - o(n)
    // Space Complexity - Worst Case - o(n)
    public static int[] twoSumOptimized(int[] nums , int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {

            int otherKey = target - nums[i];

            if(map.containsKey(otherKey)) {
                return new int[] {map.get(otherKey) , i};
            }

            map.put(nums[i],i);

        }

        return new int[]{};

    }

//    public static int[] twoSum2(int[] nums , int target) {
//
//
//
//
//
//    }



}
