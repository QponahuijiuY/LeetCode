package com.mutong.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 字符串的排列
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-11 22:14
 */
public class Solution567 {
    public static void main(String[] args) {
        Solution567 solution = new Solution567();
        System.out.println(solution.checkInclusion("sb", "sbsbsbsbbs"));
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){return false;}
        //把s1全部放入到need中
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            need.put(c, need.getOrDefault(c,0)+1);
        }
        //定义滑动窗口大小为0，left为0，right为0；
        int valid = 0;
        int left = 0;
        int right = 0;
        //right 要小于s2的长度
        while (right < s2.length()) {
            char c = s2.charAt(right);
            right ++;
            //如果s2某一个位置上的元素值c和包含在need中
            if (need.containsKey(c)) {
                //把c放入到窗口中
                window.put(c, window.getOrDefault(c,0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (right - left >= s1.length()) {
                if (valid == need.size()) return true;
                char d = s2.charAt(left);
                left ++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d,0) - 1);
                }
            }
        }
        return false;
    }
}