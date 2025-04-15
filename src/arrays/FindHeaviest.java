package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindHeaviest {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(7);
        arr.add(5);
        arr.add(6);
        arr.add(2);
        List<Integer> resutl = minimalHeaviestSetA(arr);
        System.out.println(resutl);


    }


    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
        // Write your code here
        arr.sort(Collections.reverseOrder());
        int totalSum = arr.stream().mapToInt(Integer::intValue).sum();
        int subsetSum = 0;
        List<Integer> subSetA = new ArrayList<>();

        for(int i = arr.size() - 1 ; i >= 0 ; i--) {
            subSetA.add(arr.get(i));
            subsetSum += arr.get(i);
            if(subsetSum > totalSum - subsetSum) {
                break;
            }
        }

        Collections.sort(subSetA);
        return subSetA;
    }

}
