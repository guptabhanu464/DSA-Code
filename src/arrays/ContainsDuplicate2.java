package arrays;

import java.util.HashMap;

public class ContainsDuplicate2 {

    public static void main(String[] args) {

        int[] arr = {1,0,1,1};
        int k = 1;

        boolean res = containsNearbyDuplicate(arr, k);
        System.out.println(res);


    }


    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(mpp.containsKey(nums[i]) && i-mpp.get(nums[i])<=k) return true;

            mpp.put(nums[i],i);
        }
        return false;
    }
}
