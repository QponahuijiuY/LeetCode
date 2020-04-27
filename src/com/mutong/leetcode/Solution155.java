package com.mutong.leetcode;

import java.util.Stack;

/**
 * @description: 最小栈问题
 * @Author: Mutong
 * @Date: 2020-04-27 15:53
 * @time_complexity: O()
 */
public class Solution155 {

    Stack<Integer> stackA = new Stack();
    Stack<Integer> stackB = new Stack();

    public void push(int x) {
        stackA.push(x);
        if(!stackB.isEmpty()){
            if(x < stackB.peek()){
                stackB.push(x);
            }
        }else{
            stackB.push(x);
        }
    }


    public void pop() {
        int pop = stackA.pop();
        int top = stackB.peek();
        if(pop == top){
            stackB.pop();
        }
    }

    public int top() {
        return stackA.peek();
    }

    public int getMin() {
        return stackB.peek();
    }
}