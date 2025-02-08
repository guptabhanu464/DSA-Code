package binarySearch;

public class FindMininumInRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        //int min = findMin(nums);
        int min = findMinUsingBinarySearch(nums);
        System.out.println(min);


    }

    // Using Linear Search - O(N)
    public static int findMin(int[] nums) {

        int min= Integer.MAX_VALUE;

        for(int num : nums) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    // Using Binary Search
    public static int findMinUsingBinarySearch(int[] nums) {

        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {

            int mid = low + (high - low)/2;
            if(nums[low] <= nums[mid]) {

                min = Math.min(nums[low] , min);
                low = mid + 1;
            } else {
                high = mid -1;
                min = Math.min(min , nums[mid]);

            }
        }

        return min;

    }
}
