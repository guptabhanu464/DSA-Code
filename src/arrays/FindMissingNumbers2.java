package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers2 {

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> integers = findMissingNumber(arr);
        System.out.println(integers);
    }

    public static List<Integer> findMissingNumber(int[] nums) {

        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++) {

            int indx = Math.abs(nums[i]) - 1;
            if(nums[indx] < 0) {
                continue;
            }
            nums[indx] *= -1;
        }

        for(int i = 0 ; i< nums.length ; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
