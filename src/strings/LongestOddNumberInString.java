package strings;

public class LongestOddNumberInString {

    public static void main(String[] args) {

        String s = "52";
        String result = findLargestOddNumberString(s);
        System.out.println(result);
    }

    public static String findLargestOddNumberString(String s) {

        for(int i = s.length() -1 ; i >= 0 ; i--) {

            if((s.charAt(i)-'0') % 2 == 1) {
                return s.substring(0,i+1);
            }

        }
        return "";

    }
}
