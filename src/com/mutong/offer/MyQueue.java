package com.mutong.offer;

import java.util.Stack;

/**
 * @description: 用栈实现队列
 * @Author: Mutong
 * @Date: 2020-03-01 21:11
 * @time_complexity: O()
 */
public class MyQueue {
    private Stack<Integer> input ;
    private Stack<Integer> output ;
    /** Initialize your data structure here. */
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
            input.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (output.isEmpty()){
            while (!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (output.isEmpty()){
            while (!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }




//    Stack<Integer> stack;
//    Stack<Integer> help;
//
//    /** Initialize your data structure here. */
//    public MyQueue() {
//         stack= new Stack<>();
//         help = new Stack<>();
//    }
//
//    /** Push element x to the back of queue. */
//    public void push(int x) {
//        while (!stack.isEmpty()){
//            help.push(stack.pop());
//        }
//        stack.push(x);
//        while (!help.isEmpty()){
//            stack.push(help.pop());
//        }
//    }
//
//    /** Removes the element from in front of queue and returns that element. */
//    public int pop() {
//        return stack.pop();
//    }
//
//    /** Get the front element. */
//    public int peek() {
//        return stack.peek();
//    }
//
//    /** Returns whether the queue is empty. */
//    public boolean empty() {
//        return stack.empty();
//    }
}



