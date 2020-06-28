package com.mutong.leetcode.huisu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 电话号码的组合 3^n = O(2^n)
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-28 18:57
 */
public class Solution17 {
    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        List<String> list = solution.letterCombinations("23456");
        System.out.println(list);
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList();
        if(digits == null || digits.length() == 0){
            return res;
        }
        Map<Character,String> map = new HashMap();
        map.put('0',"");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        findCombination(digits,0,"",map,res);
        return res;
    }
    private void findCombination(String digits, int index,String s,Map<Character,String> map,List<String> res){

        System.out.println("index = " + index + "---" + "s = " + s);
        //终结条件
        if(index == digits.length()){
            res.add(s);
            return;
        }
        //输入数字对应的第一个字符
        char c = digits.charAt(index);
        String letters = map.get(c);
        for(int i = 0; i < letters.length();i++){
            findCombination(digits,index + 1,s + letters.charAt(i),map,res);
        }
        return;
    }
}