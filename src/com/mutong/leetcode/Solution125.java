package com.mutong.leetcode;

/**
 * @description: 验证回文串
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-21 8:21
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0){
            return true;
        }
        String s1 = s.toLowerCase();
        int i = 0;
        int j = s1.length() - 1;
        while (i < j){
            //遇到不是字母或者数字跳过
            if (!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if (s1.charAt(i) != s1.charAt(j)){
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
