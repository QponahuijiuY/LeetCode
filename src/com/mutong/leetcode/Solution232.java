package com.mutong.leetcode;

import java.util.Stack;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-27 19:48
 * @time_complexity: O()
 */
public class Solution232 {
    Stack<Integer> stackA;
    Stack<Integer> stackB;

    /** Initialize your data structure here. */
    public Solution232() {
        stackA = new Stack();
        stackB = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackA.push(x);
        if(stackB.isEmpty()){
            while(!stackA.isEmpty()){
                stackB.push(stackA.pop());
            }
        }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stackB.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stackB.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackB.isEmpty() && stackA.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */