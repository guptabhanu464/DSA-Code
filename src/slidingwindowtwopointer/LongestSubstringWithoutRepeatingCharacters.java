package slidingwindowtwopointer;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String s = "abcdefabcghea";

        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }


    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        int l = 0 , r = 0;
        int size = s.length();

        Map<Character , Integer> map = new HashMap<>();
        while(r < size) {
            char ch = s.charAt(r);

            if(map.containsKey(ch)) {
                l = Math.max(l , map.get(ch) + 1);
            }

            map.put(ch,r);
            max = Math.max(max , r -l + 1);

            r++;
        }

        return max;
    }



}
