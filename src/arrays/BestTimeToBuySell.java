package arrays;

public class BestTimeToBuySell {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int n = prices.length;

        int left = 0;
        int maxProfit = 0;
        for(int right = 0 ; right < n; right++) {

            if(prices[right] - prices[left] > 0) {
                maxProfit = Math.max(prices[right] - prices[left] , maxProfit);
            } else {
                left = right;
            }
        }

        System.out.println(maxProfit);

    }
}
