package arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        // OUTPUT - 3 , 4 ,5 , 1, 2
        // Rotated By 2 elements
        int k = 2;
        //int[] r1 = reverseArray(arr , 0 , arr.length-1);
        //int[] r2 = reverseArray(r1 , 0 , k);
        //int[] r3 = reverseArray(r2 , k+1 , arr.length-1);
        rotate(arr,k);
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(r1));
       // System.out.println(Arrays.toString(r2));
       // System.out.println(Arrays.toString(r3));

    }

    public static int[] reverseArray(int[] arr , int left , int right) {
        int l = left, r = right;

        while (l < r) {
            // Swap elements
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        return arr;
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums , 0 , nums.length -1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , nums.length -1);
    }

    public static void reverse(int[] arr , int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
