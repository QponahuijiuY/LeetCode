package com.mutong.leetcode;

/**
 * @description: 反转字符串里面的单词
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-20 8:41
 */
public class Solution151 {
    public static void main(String[] args) {
        Solution151 solution = new Solution151();
        String s = solution.reverseWords("the sky is blue");
        System.out.println(s);
    }
    public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0 ; i--) {
            if (str[i].equals("")) continue;
                sb.append(str[i] + " ");

        }
        return sb.toString().trim();
    }
}
