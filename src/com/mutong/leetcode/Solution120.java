package com.mutong.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 三角形路径的最小值
 * @Author: Mutong
 * @Date: 2020-04-30 22:15
 * @time_complexity: O()
 */
public class Solution120 {
    public static void main(String[] args) {

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()+1];
        int size = triangle.size();
        for (int i = size-1; i >= 0; i--) {
            List<Integer> mini = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                  dp[j] = Math.min(dp[j] , dp[j+1]) +triangle.get(i).get(j);
            }
        }
        return dp[0];

    }
    public int minimumTotal1(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()+1];
        for (int i = triangle.size()-1; i >= 0; i--) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                //dp(i,j) = min( dp(i-1,j) dp(i-1,j+1) ) + nums[i][j]
               dp[j]  = Math.min(dp[j],dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
    public int minimumTotal2(List<List<Integer>> triangle) {

        int[][] dp = new int[triangle.size()+1][triangle.size()+1];
        for (int i = triangle.size()-1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] = Math.min(dp[i+1][j],dp[i+1][j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}
