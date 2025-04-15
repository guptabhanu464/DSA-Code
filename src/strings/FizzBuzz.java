package strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {

        int n = 20;
        List<String> strings = fizzBuzz(n);
        strings.forEach(System.out::println);
    }


    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            switch ((i % 3 == 0 ? 1 : 0) + (i % 5 == 0 ? 2 : 0)) {
                case 3:
                    result.add("FizzBuzz");
                    break;
                case 1:
                    result.add("Fizz");
                    break;
                case 2:
                    result.add("Buzz");
                    break;
                default:
                    result.add(String.valueOf(i));
            }
        }
        return result;
    }
}


