package arrays;

import java.util.Arrays;

public class SortColours {


    // Better Approach
    // Time Complexity - O(2N)
    public static void main(String[] args) {

        int[] color = {2,0,2,1,1,0};

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int num : color) { // Looping Through Array - N
            switch (num) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }

        }

        for(int i = 0 ; i < count0 ; i++) {
            color[i] = 0;
        }

        for(int i = count0 ; i < count1+count0 ; i++) {
            color[i] = 1;
        }
        for(int i = count0 + count1 ; i < color.length ; i++) {
            color[i] = 2;
        }

        // 3 ITERATION looping through array Indirectly - N

        // Total Complexity - N + N = 2N
        // Space Complexity - o(1)
        System.out.println(Arrays.toString(color));

    }
}
