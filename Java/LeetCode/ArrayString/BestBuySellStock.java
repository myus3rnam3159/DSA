package ArrayString;

public class BestBuySellStock {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;

        while(r < prices.length) {
            if(prices[l] >= prices[r]){
                l = r;
            }
            else if(prices[r] - prices[l] > max){
                max = prices[r] - prices[l];
            }
            ++r;      
        }
        return max;
    }
}
