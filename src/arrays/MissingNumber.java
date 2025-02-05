package arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1,0,3,4,5,6};

        int n = arr.length;
        int result = n*(n + 1)/2;

        int arraySum = 0;


        // o(n)
        for(int num : arr) {
            arraySum = num + arraySum;
        }

        int missingNumber = result - arraySum;

        System.out.println(missingNumber);
    }
}
