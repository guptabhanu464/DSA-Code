package recursion;

public class PrintName {

    public static void main(String[] args) {

        int numberOfTimes = 6;
       // printName(0,numberOfTimes);
       // printNumberDesc(numberOfTimes);
       // printNumberBackTracking(6,numberOfTimes);
       // printSumOfN(6,0);
      //  Integer sum = printSumOfNumbers(numberOfTimes);
        Integer product = printFactorialOfNumbers(6);

        System.out.println(product);
    }

    // Basic Question OF Recursion
    public static void printName(Integer n , Integer max) {

        if(n > max) return; // Base Condition Till Which recursion will work

        System.out.println("My Name is Bhanu Gupta");
        printName(n+1 , max);
    }

    // Similar Problem
    // Print Linearly For 1 - to N

    public static void printNumber(Integer n , Integer max) {

        if(n > max) return; // Base Condition Till Which recursion will work

        System.out.println(n);
        printNumber(n+1 , max);
    }

    // Similar Problem
    // Print from N to 1

    public static void printNumberDesc(Integer max) {

        if(max < 1) return; // Base Condition Till Which recursion will work

        System.out.println(max);
        printNumberDesc( max - 1);
    }

    // This will done using Backtracking

    public static void printNumberBackTracking(Integer i , Integer max) {

        if(i < 0) return;

        printNumberBackTracking(i - 1 , max);
        System.out.println(i);

    }

    // Print Sum of N Numbers
    // This is parameterized approach
    public static void printSumOfN(Integer i , Integer sum) {

        if(i < 1) {
            System.out.println(sum);
            return;
        }

        printSumOfN(i - 1 , sum + i);
    }

    // Now will be doing with Functional Approach
    public static Integer printSumOfNumbers(Integer n) {

        if(n == 0) return 0;

        return n + printSumOfNumbers(n-1);
    }

    public static Integer printFactorialOfNumbers(Integer n) {

        if(n == 0) return 1;

        return n * printFactorialOfNumbers(n-1);
    }

}
