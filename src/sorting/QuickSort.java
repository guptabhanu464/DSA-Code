package sorting;

public class QuickSort {
    // Time Complexity - O(nlogn) -- Average Time Complexity
    // Worst Time - O(n^2)
    public static void main(String[] args) {

        int[] arr = {3,1,5,6,9,7,8,2};

        quickSort(arr,0, arr.length-1);

        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr , int low , int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr , int low , int high) {
        int pivot = arr[high];
        int i = low -1;

        for(int j= low ;j < high;j++) {

            if(arr[j] < pivot) {
                i++;
                // swap of variables
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
}
