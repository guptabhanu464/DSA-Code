package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,5,5};

        int[] array = IntStream.of(arr).distinct().toArray();
        System.out.println(Arrays.toString(array));

        int[] val = removeDuplicates(arr);
        System.out.println(val.length);
    }

    public static int[] removeDuplicates(int[] arr) {

        int n = arr.length;
        if(n == 0 || n == 1) {
            return arr;
        }

        int j = 0;
        for(int i = 1 ; i < arr.length ; i++) {
            if(arr[j] != arr[i]) {
                arr[++j] = arr[i];
            }
        }

        return Arrays.copyOf(arr,j+1);
    }


}
