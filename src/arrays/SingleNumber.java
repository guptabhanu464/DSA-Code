package arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {

        int[] arr = {4,1,2,1,2};
        int res = singleNumber(arr);
        int res1 = singleNumber1(arr);
        System.out.println(res);
        System.out.println(res1);
    }

    public static int singleNumber1(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num; // XOR operation
        }
        return result;
    }



    public static int singleNumber(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }
        int result = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer , Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                result = entry.getKey();
                return result;
            }
        }

        return result;
    }




}
