package com.mutong.leetcode;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-05-02 11:12
 * @time_complexity: O()
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;//第0天不持股,利润为0
        dp[0][1] = -prices[0]; //第0天持股,利润为负数
        //dp状态定义:dp[i][j] 第i天的时候的最大利润 j表示用户不持股和持股,0或1
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);//昨天也不持股/昨天持股,但是今天卖了
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[prices.length-1][0];

    }
}
