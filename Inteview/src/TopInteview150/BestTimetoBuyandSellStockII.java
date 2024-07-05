package TopInteview150;

/**
 * @Author Jinxu Zheng
 * @Date 7/4/2024
 **/
public class BestTimetoBuyandSellStockII {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int current = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > current) {
                maxProfit += prices[i] - current;
            }
            current = prices[i];
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] ints = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(ints);
        System.out.println(maxProfit);
    }
}
