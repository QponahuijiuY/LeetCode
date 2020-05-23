package com.mutong.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:最下覆盖子串
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-23 14:10
 */
public class Solution76 {
    public static void main(String[] args) {
        Solution76 solution = new Solution76();
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));
    }
        public String minWindow(String s, String t) {
            if (s.length() == 0 || t.length() == 0){
                return "";
            }
            Map<Character,Integer> need = new HashMap();
            Map<Character,Integer> window = new HashMap();
            //need初始化，把t中的元素全部放到need中
            for(int i = 0 ; i < t.length(); i ++){
                char c = t.charAt(i);
                need.put(c,need.getOrDefault(c,0) + 1);
            }
            int left = 0;
            int right = 0;
            int count = 0;

            int start = 0;
            int end = 0;
            int minlen = Integer.MAX_VALUE;
            while(right < s.length()){
                //往windows里面添加元素，添加的前提是need中包含该字符
                char temp = s.charAt(right++);
                if(need.containsKey(temp)){
                    window.put(temp,window.getOrDefault(temp,0) + 1);
                    if (window.get(temp).compareTo(need.get(temp)) == 0){
                        count ++;
                    }
                }
                System.out.println("left:" + left  +"------"+  "right:" + right);
                while(count == need.size()){

                    //获取当前可行解的长度minlen
                    if(right - left < minlen){
                        start = left;
                        end = right;
                        minlen = right - left;
                    }
                    char d = s.charAt(left++);
                    if (need.containsKey(d)){
                        if (need.get(d).equals(window.get(d))){
                            count --;
                        }
                        window.put(d,window.getOrDefault(d,0) - 1);
                    }
                }
            }
            return minlen == Integer.MAX_VALUE ? " " : s.substring(start,end);
        }

}
