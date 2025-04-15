package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {2,2,1,6,7,3};
        int[] arr1 = {2,9,1,6,7,3};
        boolean res = containsDuplicate(arr);
        boolean res1 = containsDuplicate2(arr1);
        System.out.println(res);
        System.out.println(res1);
    }

    public static boolean containsDuplicate(int[] nums) {

        // We can use HashSet
        // TC - O(n)
        // SC - O(n)
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    // Using HashMap
    public static boolean containsDuplicate2(int[] nums) {

        // We can use HashSet
        // TC - O(n)
        // SC - O(n)
        HashMap<Integer,Integer> set = new HashMap<>();
        for (int num : nums) {
            if (set.containsKey(num)) {
                return true;
            }
            set.put(num, 1);
        }
        return false;
    }

}
