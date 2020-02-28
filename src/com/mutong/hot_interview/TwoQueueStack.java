package com.mutong.hot_interview;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 用两个队列实现栈
 * @Author: Mutong
 * @Date: 2020-02-27 11:48
 * @time_complexity: O()
 */
public class TwoQueueStack {
    private Queue<Integer> data;
    private Queue<Integer> help;

    public TwoQueueStack(){
        data = new LinkedList<Integer>();
        help = new LinkedList<Integer>();
    }

    //入栈,在data队列中把这个数入队
    public void push(int n){
        data.add(n);
    }
    public int pop(){
        //只要data数据不为空,就把data队列除最后一个入队的数字移动到help队列里面
        while (data.size() > 1){
            help.add(data.poll());
        }
        int res = data.poll();
        swap();
        return res;
    }

    public int peek(){
        while (data.size() > 1){
            help.add(data.poll());
        }
        int res = data.poll();
        data.add(res);
        swap();
        return res;
    }
    //改变两个=引用
    private void swap() {
        Queue<Integer> temp = help;
        help = data;
        data = temp;
    }

}
