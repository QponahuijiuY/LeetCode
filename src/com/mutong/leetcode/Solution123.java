package com.mutong.leetcode;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-05-02 11:12
 * @time_complexity: O()
 */
public class Solution123 {
    public int maxProfit(int[] prices) {
        if(prices.length<2){return 0;}
        int k = 2;
        int[][][] dp = new int[prices.length][k+1][2];
        for (int i = 1; i <= k; i++) {
            //定义初始值
            dp[0][i][0]=0;
            dp[0][i][1]=-prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = k; j >= 1; j--) {
                dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
            }
        }
        return dp[prices.length-1][k][0];
    }


    public int maxProfit1(int[] prices) {
        int k = 2;
        int[][][] dp = new int[prices.length+1][k+1][2];
        dp[0][1][0]=0;
        dp[0][1][1]=-prices[0];
        dp[0][2][0]=0;
        dp[0][2][1]=-prices[0];
        for (int i = 1; i < prices.length; i++) {
                dp[i][2][0] = Math.max(dp[i-1][2][0],dp[i-1][2][1] + prices[i]);
                dp[i][2][1] = Math.max(dp[i-1][2][1],dp[i-1][1][0] - prices[i]);
                dp[i][1][0] = Math.max(dp[i-1][1][0],dp[i-1][1][1] + prices[i]);
                dp[i][1][1] = Math.max(dp[i-1][1][1],-prices[i]);
        }
        return dp[prices.length-1][k][0];


    }
}
