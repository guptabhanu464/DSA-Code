package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajortiyElement {

    public static void main(String[] args) {

        int[] nums = {2,3,2};

        int result = majorityElementMap(nums);
        System.out.println(result);

    }


    // Time Complexity - o(nlogn)
    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length / 2];

    }

    public static int majorityElementMap(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }

        }

        return -1;
    }
}
