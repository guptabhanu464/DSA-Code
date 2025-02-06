package binarySearch;

public class SearchOnRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        int ans = search(nums , 0);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);

    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int n = nums.length;
        int high = n - 1;

        while(low <= high) {
            int mid = low + (high - low)/2; // To prevent int overflow

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]) {
                    // if target exists in this
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                if(nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;

                }else {
                    high = mid -1 ;
                }
            }
        }
        return -1;
    }
}
