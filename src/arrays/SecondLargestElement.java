package arrays;

public class SecondLargestElement {

    public static void main(String[] args) {


        // Brute Approach
        // Sort the array and get the second last element of array

        int [] arr = {12, 35, 1, 10, 34, 1};
        //OUTPUT - 34
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num : arr) {

            if(num > max) {
                max2 = max;
                max = num;
            } else if(num > max2 && num < max) {
                max2 = num;
            }
        }

        System.out.println(max2);
    }
}
