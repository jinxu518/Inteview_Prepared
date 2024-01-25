package TopInteview150;

/**
 * @Author Jinxu Zheng
 * @Date 1/24/2024
 **/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE,sell=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            sell=Math.max(sell,prices[i]-buy);
        }
        return sell;
    }
}
