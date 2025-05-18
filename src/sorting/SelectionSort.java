package sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {14,16,29,30,21};
        selectionSort(arr);

    }
    // In selection sort we generally divide our array into 2 parts
    // Sorted part and unsorted part
    // We assume our first value is min value
    //
    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the minimum

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    // Function to print the array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
