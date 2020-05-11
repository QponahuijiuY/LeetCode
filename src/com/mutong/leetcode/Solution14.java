package com.mutong.leetcode;

/**
 * @description: 最长公共前缀
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-10 15:53
 */
public class Solution14 {
    public static void main(String[] args) {
        Solution14 solution = new Solution14();
        String[] strs = {"flower","float","flght"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
    /*
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        return longestCommonPrefix(strs,0,strs.length-1);
    }

    public String longestCommonPrefix(String[] strs,int left ,int right) {
        if (left == right) {
            return strs[left];
        } else {
            int mid = (left + right) / 2;
            String leftstr = longestCommonPrefix(strs, left, mid);
            String rightstr = longestCommonPrefix(strs, mid + 1, right);
            return commonstr(leftstr, rightstr);
        }
    }
    private String commonstr(String leftstr,String rightstr){
        int min = Math.min(leftstr.length(),rightstr.length());
        for(int i = 0 ; i < min; i ++){
            if (leftstr.charAt(i) != rightstr.charAt(i)){
                return leftstr.substring(0,i);
            }
        }
        return leftstr.substring(0,min);
    }
    */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        return longestCommonPrefix(strs,0,strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int left, int right) {
        if (left == right) {
            return strs[left];
        }
        int mid = (right + left) / 2;
        String leftstr = longestCommonPrefix(strs,left,mid);
        String rightstr=  longestCommonPrefix(strs,mid + 1, right);
        return commonstr(leftstr,rightstr);
    }
    private String commonstr(String s1,String s2){
        int min = Math.min(s1.length(),s1.length());
        for(int i = 0; i < min; i ++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0,i);
            }
        }
        return s1.substring(0,min);
    }

}
