package com.mutong.leetcode;

import java.util.Stack;

/**
 * @description: 两个栈实现一个队列
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-18 11:51
 */
public class jianzhi8 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}