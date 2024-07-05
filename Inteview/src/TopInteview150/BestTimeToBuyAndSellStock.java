package TopInteview150;

/**
 * @Author Jinxu Zheng
 * @Date 1/24/2024
 **/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minBuyPrice = Math.min(minBuyPrice, price);
            maxProfit = Math.max(maxProfit, price - minBuyPrice);
        }
        return maxProfit;
    }
}
