package com.mutong.leetcode;

/**
 * @description: 字符串相乘
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-11 22:52
 */
public class Solution43 {
    public static void main(String[] args) {
        Solution43 solution = new Solution43();
        System.out.println(solution.multiply("123", "321"));
    }
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")){
            return "0";
        }
        //res是一个数组，表示接受结果值的数组
        int[] res = new int[num1.length() + num2.length()];
        //从个位开始算起
        for (int i = num1.length() - 1;i >= 0; i--){
            for(int j = num2.length() - 1 ; j >= 0; j--){
                //乘积
                int mul = res[i+j+1] + ( num1.charAt(i)- '0') * (num2.charAt(j)-'0');
                int p1 = i+j; //4，p1用来存放进位
                int p2 = i+j+1; //5 p2用来存放余数位src/com/mutong/leetcode/Solution43.java

                //余数
                res[p2]= mul % 10 ;
                //进位
                res[p1] += mul /10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if (i == 0 && res[i] == 0) continue;
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
