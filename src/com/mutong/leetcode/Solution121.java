package com.mutong.leetcode;

/**
 * @description: 买卖股票的最佳实际 (1次)
 * @Author: Mutong
 * @Date: 2020-05-01 22:29
 * @time_complexity: O()
 */
public class Solution121 {
    public int maxProfit2(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;//第0天不持股,利润为0
        dp[0][1] = -prices[0]; //第0天持股,利润为负数
        //dp状态定义:dp[i][j] 第i天的时候的最大利润 j表示用户不持股和持股,0或1
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);//昨天也不持股/昨天持股,但是今天卖了
            dp[i][1] = Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[prices.length-1][0];
    }
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                res = Math.max(res,prices[j] - prices[i]);
            }
        }
        return res;
    }

    public int maxProfit1(int[] prices) {
        int dp = 0;//dp表示当前的利润最大值
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int res = prices[i] - prices[i - 1];
            dp = Math.max(dp+res,res);
            dp = Math.max(dp,max);
        }
        return dp;
    }




}
