package com.mutong.leetcode;

/**
 * @description:
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-23 22:16
 */
public class jianzhi9 {
    public static void main(String[] args) {
        jianzhi9 jianzhi = new jianzhi9();
        System.out.println(jianzhi.fib(5));
    }
    public int fib(int n) {
        int[] dp = new int[n + 1];
        if (n == 0) return 0;
        if (n == 1)  return 1;
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        return dp[n];
    }
}
