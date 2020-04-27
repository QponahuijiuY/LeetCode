package com.mutong.offer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-04 15:44
 * @time_complexity: O()
 */
public class maxProfit {
    public static void main(String[] args) {
        int[] price = {2,1,2,0,1};
        System.out.println(maxProfit(price));
    }
    //完成任意数量的交易
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1){
            return -1;
        }
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
