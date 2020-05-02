package com.mutong.leetcode;

/**
 * @description: 力扣300
 * 状态定义: dp[i]表示从头到i元素,最长子序列的长度
 * 返回值: max(dp[0],dp[1]......dp[n-1])
 * 状态转移方程: dp[i] = max(dp[j] + 1,dp[i]), j是i的前一个数字,j: 0->i-1, 且a[j]<a[i]的值
 * @Author: Mutong
 * @Date: 2020-05-02 15:59
 * @time_complexity: O()
 */
public class Solution300 {
    public int lengthOfLIS(int[] nums) {

        int[] dp = new int[nums.length];
        int maxres = 1;
        for (int i = 1; i < nums.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if( nums[j] < nums[i] ) {
                    max = Math.max(dp[j],max);
                }
            }
            dp[i] = max + 1;
            maxres = Math.max(dp[i],maxres);
        }

        return maxres;
    }

}
