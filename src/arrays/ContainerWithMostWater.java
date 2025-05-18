package arrays;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,7};
        int area = maxArea(arr);
        System.out.println(area);
    }

    static int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {

            if(height[left] < height[right]) {
                maxArea = Math.max(maxArea , height[left] * (right - left));
                left++;
            } else {
                maxArea = Math.max(maxArea , height[right] * (right - left));
                right--;
            }
        }

        return maxArea;
    }


}
