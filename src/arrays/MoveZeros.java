package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

      //  int[] nums = {0,1,0,3,12};

//        for(int i = 0 ; i < nums.length ; i++) {
//
//            for(int j = i + 1 ; j < nums.length ; j++) {
//
//
//
//            }
//
//
//        }

        moveZerosBruteApproach();
    }



    // First Step - Add non zero elements to new array
    // Second step - Add those non zero elements to front of existing array
    // Third Step - Add remaining with zeros
    public static void moveZerosBruteApproach() {

        int[] nums = {0,1,0,3,12};

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++) {

            if(nums[i] != 0) {
                result.add(nums[i]);
            }
        }

        int nz = result.size();

        for(int j = 0 ; j < nz ; j++) {

            nums[j] = result.get(j);
        }

        for(int x = nz + 1 ; x < nums.length ; x++) {

            nums[x] = 0;
        }


        System.out.println(Arrays.toString(nums));

    }

    // Optimal Approach
    public static void moveZeroes(int[] nums) {

        int left = 0;
        for(int r = 0 ; r < nums.length ; r++) {
            if(nums[r] != 0) {
                int temp = nums[left];
                nums[left] = nums[r];
                nums[r] = temp;
                left++;
            }
        }
    }




}
