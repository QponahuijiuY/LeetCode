package com.mutong.leetcode;

/**
 * @description:
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-23 22:13
 */
public class jianzhi10 {
    public static void main(String[] args) {
        jianzhi10 jianzhi = new jianzhi10();
        System.out.println(jianzhi.numWays(5));
    }
    public int numWays(int n) {
        int[] dp = new int[n+1];
        if(n == 0) return 1;
        if(n == 1) return 1;
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2 ; i <= n ; i ++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
