package com.mutong.leetcode;

/**
 * @description: 最大自序和
 * @Author: Mutong
 * @Date: 2020-05-03 20:31
 * @time_complexity: O()
 */
public class Solution53 {
    public static void main(String[] args) {
        Solution53 solution = new Solution53();
        int[] nums = {-5,9,-10,8,3,10,-9,1};
        System.out.println(solution.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums){
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] < 0 ? nums[i] : nums[i] + dp[i - 1];
            res = Math.max(dp[i],res);
        }
        return res;
    }
}
