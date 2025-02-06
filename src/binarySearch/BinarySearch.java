package binarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        // Binary Search Generally Works on Sorted part
        // Time Complexity - (log2N)

        // Now we will understand by code how this works

        // Here we have to find 2 element index
        int[] arr = {4,5,6,7,0,1,2};

        int index = binarySearch(arr , 0);
        System.out.println(index);
        // For this we can use Linear Search
        // But that will give Time Complexity of - O(N)
        // Hence to reduce that we can will be using the concept of Binary Search

    }

    public static int binarySearch(int[] nums , int element) {

        int start = 0;
        int end = nums.length - 1;

         // This we have done to prevent Int overflow
        // Now we will be checking the element

        while(start <= end) { // This will run when start is less than end
            int mid = start + (end - start)/2;
            if(nums[mid] == element) {
                return mid;
            } else if(nums[mid] >= element) {
                start = mid + 1;
            } else  {
                end = mid -1;

            }
        }
        return -1;
    }



}
