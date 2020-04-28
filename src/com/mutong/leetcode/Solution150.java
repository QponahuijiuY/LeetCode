package com.mutong.leetcode;

import java.util.Stack;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-27 17:21
 * @time_complexity: O()
 */
public class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Integer i,j;
        for (String s : tokens) {
            switch (s){
                case "+":
                    i = stack.pop();
                    j = stack.pop();
                    stack.push(j + i);
                    break;

                case "-":
                    i = stack.pop();
                    j = stack.pop();
                    stack.push(j - i);
                    break;

                case "*":
                    i = stack.pop();
                    j = stack.pop();
                    stack.push(j * i);
                    break;

                case "/":
                    i = stack.pop();
                    j = stack.pop();
                    stack.push(j / i);
                    break;

                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.pop();
    }
}
