package strings;

public class RemoveOuterMostParenthesis {

    public static void main(String[] args) {

        String s = "(()) (()())";
        // Output - "()()()"
        // Need to remove outermost parenthesis

        StringBuilder builder = new StringBuilder();
        int counter = 0;

        for(int i = 0 ; i < s.length() ; i++) {
            // Here the execution matters
            // How code is Written
            if(s.charAt(i) == ')') {
                counter--;
            }

            if(counter !=0) {
                builder.append(s.charAt(i));
            }

            if(s.charAt(i) == '(') {
                counter++;
            }
        }

        System.out.println(builder.toString());

    }
}
