package binarySearch;

public class FindFloor {

    public static void main(String[] args) {

        int[] nums = {1, 2, 8, 10, 11, 12, 19};
        int index = findFloor(nums,5);
        System.out.println(index);

    }

    public static int findFloor(int[] nums , int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        // write code here
        while(low <= high) {

            int mid = low + (high - low)/2;

            if(nums[mid] >= target) {

                ans = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }
        return ans;
    }
}
