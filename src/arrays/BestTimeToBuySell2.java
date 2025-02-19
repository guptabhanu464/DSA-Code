package arrays;

public class BestTimeToBuySell2 {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit);

    }

    public static int maxProfit(int[] prices) {

        int bd = 0;
        int sd = 0;
        int profit = 0;

        for(int i = 1 ; i < prices.length ; i++) {
            if(prices[i] >= prices[i-1]) {
                sd++;
            } else {
                profit += prices[sd] - prices[bd];
                sd=bd=i;
            }
        }
        profit += prices[sd] - prices[bd];
        return profit;

    }

    // This can be done with the help of Dynamic Programming
    // Will add once done with that approach
}
