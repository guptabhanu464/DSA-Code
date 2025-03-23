package arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        // OUTPUT - 3 , 4 ,5 , 1, 2
        // Rotated By 2 elements
        int k = 2;
        int[] r1 = reverseArray(arr , 0 , arr.length-1);
        int[] r2 = reverseArray(r1 , 0 , k);
        int[] r3 = reverseArray(r2 , k+1 , arr.length-1);

        System.out.println(Arrays.toString(r1));
        System.out.println(Arrays.toString(r2));
        System.out.println(Arrays.toString(r3));

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

    static void rotateArr(int arr[], int k) {

        int n = arr.length;
        k = k % n;

        reverseArray1(arr, 0, k - 1);
        reverseArray1(arr, k, n-1);
        reverseArray1(arr, 0, n - 1);

    }


    public static void reverseArray1(int[] arr, int left, int right) {
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

}
