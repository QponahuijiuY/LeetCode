package com.mutong.bishi.longtuyouxi;

/**
 * @description:
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-17 16:50
 */
public class Main {
    public static void main(String[] args) {
        short i = 1;
        double j = 1.0;
        char l = '1';
        byte o = 1;

    }
    public final static native int w();
    public static int lenghOfLCS(String s1, String s2) {
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n1][n2];
        if(char1[0] == char2[0]) {dp[0][0] = 1;}
        for(int i = 1; i < n2; ++i) {
            if(char1[0] == char2[i]){
                dp[0][i] = 1;
            }
            else{
                dp[0][i] = dp[0][i-1];
            }
        }
        for(int i = 1; i < n1; ++i) {
            if(char2[0] == char1[i]){
                dp[i][0] = 1;
            }
            else{
                dp[i][0] = dp[i-1][0];
            }
        }

        //递推求解各个字符处的LCS
        for(int i = 1; i < n1; ++i) {
            for(int j = 1; j < n2; ++j) {
                if(char1[i] == char2[j]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = dp[i-1][j] > dp[i][j-1] ? dp[i-1][j] : dp[i][j-1];
                }
            }
        }

        return dp[n1-1][n2-1];
    }
}
class A{

}
