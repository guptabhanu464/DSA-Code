package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {20, 19, 87, 34, 0, 5, 3};
        divide(arr, 0, arr.length - 1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Time Complexity - O(nlogn)

    public static void divide(int[] arr, int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        //
        conquer(arr, si, mid, ei);
        System.out.println(Arrays.toString(arr));
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {

        int[] merged = new int[ei - si + 1]; // Length of new Array
        int indx = si;
        int indx1 = mid + 1;
        int x = 0;

        while (indx <= mid && indx1 <= ei) {
            if (arr[indx] <= arr[indx1]) {
                merged[x++] = arr[indx++];

            } else {
                merged[x++] = arr[indx1++];
            }
        }

        while (indx <= mid) {
            merged[x++] = arr[indx++];
        }

        while (indx1 <= ei) {
            merged[x++] = arr[indx1++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}
