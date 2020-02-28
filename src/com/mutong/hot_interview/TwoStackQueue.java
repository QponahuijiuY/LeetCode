package com.mutong.hot_interview;

import java.util.Stack;

/**
 * @description: 用两个栈实现队列
 * @Author: Mutong
 * @Date: 2020-02-27 11:56
 * @time_complexity: O()
 */
public class TwoStackQueue {
    private Stack<Integer> data;
    private Stack<Integer> help;

    public TwoStackQueue(){
        data = new Stack<>();
        help = new Stack<>();
    }

    //入队列
    public void add(int n){
        data.push(n);
        dao();
    }
    //查看队首元素
    public int peek(){
        if (data.empty() && help.empty()){
            throw new RuntimeException("");
        }
        dao();
        return help.peek();
    }

    //出队列
    public int poll(){
        if (data.empty() && help.empty()){
            throw new RuntimeException("");
        }
        dao();
        return help.pop();
    }

    private void dao() {
        if (!help.isEmpty()){
            return;
        }
        if (!data.isEmpty()){
            help.push(data.pop());
        }
    }


}
