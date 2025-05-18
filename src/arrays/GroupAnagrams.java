package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagram(strs);
        System.out.println(lists);
    }

    static List<List<String>> groupAnagram(String[] list) {

        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: list) {

            char[] arr = new char[26];
            for(char c : s.toCharArray()) {
                arr[c - 'a']++;
            }

//            StringBuilder builder = new StringBuilder();
//            for(int i : arr) {
//                builder.append("#");
//                builder.append(i);
//            }

           // String key = builder.toString();
            String key = String.valueOf(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }


}
