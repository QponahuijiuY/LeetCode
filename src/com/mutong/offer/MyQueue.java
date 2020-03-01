package com.mutong.offer;

import java.util.Stack;

/**
 * @description: 用栈实现队列
 * @Author: Mutong
 * @Date: 2020-03-01 21:11
 * @time_complexity: O()
 */
public class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> help;

    /** Initialize your data structure here. */
    public MyQueue() {
         stack= new Stack<>();
         help = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!stack.isEmpty()){
            help.push(stack.pop());
        }
        stack.push(x);
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty();
    }
}



