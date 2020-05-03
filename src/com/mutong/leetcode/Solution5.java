package com.mutong.leetcode;

/**
 * @description: 最长回文子串
 * @Author: Mutong
 * @Date: 2020-05-03 18:08
 * @time_complexity: O()
 */
public class Solution5 {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        System.out.println(solution.longestPalindrome("bbaba"));
    }
    public String longestPalindrome(String s) {
        int start = 0;
        int maxlen = 1;
        if (s.length() < 2 ) {
            return s;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) == s.charAt(j)){
                    if (j - i < 3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }else {
                    dp[i][j] = false;
                }
                if (dp[i][j]){
                    int curlen = j - i + 1;
                    if (curlen > maxlen){
                        maxlen = curlen;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start,start + maxlen);
    }

}
