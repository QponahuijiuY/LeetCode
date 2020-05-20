package com.mutong.leetcode;

import java.util.Arrays;

/**
 * @description: 零钱兑换
 * @Author: Mutong
 * @Date: 2020-05-02 19:27
 * @time_complexity: O()
 */
public class Solution322 {
    public static void main(String[] args) {
        Solution322 solution = new Solution322();
        int[] coins = {1,2,5};
        System.out.println(solution.coinChange(coins, 20));
    }

    public int coinChange(int[] coins, int amount) {

        // 给 0 占位
        int[] dp = new int[amount + 1];
        // 注意：因为要比较的是最小值，这个不可能的值就得赋值成为一个最大值
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != amount + 1) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        if (dp[amount] == amount + 1) {
            dp[amount] = -1;
        }
        return dp[amount];

    }
}
