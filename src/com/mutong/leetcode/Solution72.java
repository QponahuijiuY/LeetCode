package com.mutong.leetcode;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-05-02 18:34
 * @time_complexity: O()
 */
public class Solution72 {
    public static void main(String[] args) {
        Solution72 solution = new Solution72();
        System.out.println(solution.minDistance1("horse", "ros"));
    }
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= len2; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }
        return dp[len1][len2];
    }
    public int minDistance1(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int[][] dp = new int[w1.length+1][w2.length+1];

        for (int i = 0; i < w1.length+1 ; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < w2.length+1; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i < w1.length+1; i++) {
            for (int j = 1; j < w2.length+1; j++) {
                if (w1[i] == w2[j]){
                    dp[i][j] = dp[i-1][j-1];
                }
                dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]) + 1;

            }
        }
        return dp[w1.length][w2.length];
    }
}