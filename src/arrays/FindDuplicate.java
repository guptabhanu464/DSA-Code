package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,3,4,2,2};
        int res = findDuplicate(nums);
        System.out.println(res);



    }

    public static int findDuplicate(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i],0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

}
