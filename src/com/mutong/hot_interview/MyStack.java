package com.mutong.hot_interview;

import java.util.Stack;

/**
 * @description: 实现一个特殊的栈,在实现栈的基本功能上,在创建一个方法,返回栈的最小元素,要求push,pop,getMin时间复杂度都是O(1)
 * @Author: Mutong
 * @Date: 2020-02-27 11:00
 * @time_complexity: O()
 */
public class MyStack {
    //定义一个数据栈,一个最小栈,
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MyStack(){
        this.dataStack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }

    public void push(int newNum){
        //入栈
        if(this.minStack.isEmpty()){
            //如果最小栈是空的,把newnum也压入最小栈
            this.minStack.push(newNum);
        }else if(newNum < this.getMin()){
            //如果新入栈的数比最小栈内最最小值还要小,把新入栈的数也加入最小栈
            this.minStack.push(newNum);
        }else {
            //如果新入栈的数比最小栈内最小值要大,继续把最小栈栈顶元素入栈.
            int newMin = this.minStack.peek();
            this.minStack.push(newMin);
        }
        this.push(newNum);
    }

    public int pop(){
        //出栈
        if (this.dataStack.isEmpty()){
            throw new RuntimeException("");
        }
        this.minStack.pop();
        return this.dataStack.pop();
    }
    public int getMin() {
        if (this.minStack.isEmpty()){
            throw new RuntimeException("");
        }
        return this.minStack.peek();
    }
}
