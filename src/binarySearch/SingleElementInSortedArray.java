package binarySearch;

import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray {

    public static void main(String[] args) {

        int[] nums = {1,1,2,3,3,4,4,8,8};
        int value = findSingleElementOptimal(nums);
        System.out.println(value);

    }

    public static int findSingleElement(int[] nums) {

        int result = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                result = entry.getKey();
            }

        }
        return result;
    }

    public static int findSingleElementOptimal(int[] nums) {

        int n = nums.length;

        if(n ==1) { // Edge Case 1
            return nums[0];
        }

        if(nums[0] != nums[1]) { //Edge Case 2
            return nums[0];
        }
        if(nums[n-1] != nums[n-2]) { //Edge Case 3
            return nums[n-1];
        }

        int low = 1;
        int high = n-2;

        while(low <= high) {

            int mid = low + (high - low)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
                return nums[mid];
            }
            if((mid % 2 == 1 && nums[mid] == nums[mid -1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])) {
                // Move to right part
                low = mid + 1;
            } else {
                // Move to left part
                high = mid - 1;
            }
        }
        return -1;
    }
}