package sorting;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) { // Last i elements are already sorted
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, array is already sorted
            if (!swapped) break;
        }
    }

    // Function to print the array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Time Complexity - O(n^2)
    public static void main(String[] args) {

        int[] arr = {2,4,6,9,7,10,54,100};
        bubbleSort(arr);
        printArray(arr);

    }


}
