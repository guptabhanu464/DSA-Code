package strings;

public class RotateString {

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "cdeab";
        boolean res = rotateString(s1,s2);
        System.out.println(res);
    }

    static boolean rotateString(String s , String goal) {

        return (s.length() == goal.length() && (s+s).contains(goal));

    }
}
