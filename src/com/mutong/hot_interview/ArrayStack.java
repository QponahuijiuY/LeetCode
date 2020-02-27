package com.mutong.hot_interview;

/**
 * @description: 用数组实现栈
 * @Author: Mutong
 * @Date: 2020-02-27 10:03
 * @time_complexity: O()
 */
public class ArrayStack {
    private Integer[] arr;
    private Integer index;//index表示的含义是我要把数字放在下标为index里面

    public ArrayStack(int initSize){
        if (initSize < 0){
            throw new IllegalArgumentException("the init size is less than 0");
        }
        arr = new Integer[initSize];
        index = 0;
    }
    public Integer peek(){
        if (index == 0){
            return null;
        }
        return arr[index - 1];

    }
    public void push(int n){
        if (index == arr.length){
            throw new ArrayIndexOutOfBoundsException("the queue is full");
        }
        arr[index++] = n;
    }
    public Integer pop(){
        if (index == 0){
            throw new ArrayIndexOutOfBoundsException("the queue is empty");
        }
        return arr[--index];
    }


}
