package strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] arr = {"flower","flow","flight"};
        String result = arr[0];

        for(int i = 1 ; i < arr.length ; i++) {
            while(arr[i].indexOf(result) != 0) {

            }
            result = common(result ,arr[i]);
        }

        System.out.println(result);

    }

    public static String common(String s1 , String s2) {

        int min = Math.min(s1.length() , s2.length());
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < min ; i++) {

            if(s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            } else {
                break;
            }

        }

        return sb.toString();
    }

}
