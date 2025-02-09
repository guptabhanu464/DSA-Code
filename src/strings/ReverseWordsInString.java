package strings;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String s = "My Name is Bhanu Gupta";
        // Output - 'Gupta Bhanu is Name My'

        String[] newString = s.trim().split(" ");
        StringBuilder newS = new StringBuilder();

        for(int i = newString.length - 1 ; i >= 0 ; i--) {
            if(!newString[i].trim().isEmpty()) {
                newS.append(newString[i]);
                newS.append(" ");
            }
        }

        System.out.println(newS.toString().trim());
    }
}
