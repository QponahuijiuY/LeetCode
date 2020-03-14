package com.mutong.offer;

import java.util.Stack;

/**
 * @description: 设计最小栈
 * @Author: Mutong
 * @Date: 2020-03-15 0:29
 * @time_complexity: O()
 */
public class MinStack {
    Stack<Integer> stackA;
    Stack<Integer> stackB;
    public MinStack() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void push(int x) {
        //把元素插入到A栈里面,如果插入的这个值比B栈顶元素小或者=,也插入B栈否则不插入,保证B栈里面存入的都是比当前栈顶元素小的值,可以作为最小栈g
        stackA.add(x);
        if (stackB.isEmpty() || stackB.peek() >= x){
            stackB.add(x);
        }
    }

    public void pop() {
        if (stackA.pop().equals(stackB.peek())){
            stackB.pop();
        }
    }

    public int top() {
        return stackA.peek();
    }

    public int min() {
        return stackB.peek();
    }
}
