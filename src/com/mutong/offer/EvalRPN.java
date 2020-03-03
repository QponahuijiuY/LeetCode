package com.mutong.offer;

import java.util.Stack;

/**
 * @description: 根据逆波兰表示法，求表达式的值。
 *
 * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 *
 * 说明：
 *
 * 整数除法只保留整数部分。
 * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 * 示例 1：
 *
 * 输入: ["2", "1", "+", "3", "*"]
 * 输出: 9
 * 解释: ((2 + 1) * 3) = 9
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/evaluate-reverse-polish-notation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: Mutong
 * @Date: 2020-03-03 22:07
 * @time_complexity: O(n)
 */
public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Integer i,j;
        for (String s: tokens
             ) {
            switch (s){
                case "+":
                    i = stack.pop();
                    j = stack.pop();
                    stack.push(i + j);
                    break;
                case "-":
                    i = stack.pop();
                    j = stack.pop();
                    stack.push(i - j);
                    break;
                case "*":
                    i = stack.pop();
                    j = stack.pop();
                    stack.push(i * j);
                    break;
                case "/":
                    i = stack.pop();
                    j = stack.pop();
                    stack.push(i / j);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.pop();
    }
}
