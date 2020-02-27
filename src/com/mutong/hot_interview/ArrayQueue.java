package com.mutong.hot_interview;

/**
 * @description: 用数组实习队列
 * @Author: Mutong
 * @Date: 2020-02-27 10:43
 * @time_complexity: O()
 */
public class ArrayQueue {
    private Integer[] arr;
    private Integer size;
    private Integer start;
    private Integer end;

    public ArrayQueue(int initSize){
        if (initSize < 0){
            throw new IllegalArgumentException("the init size is less than 0");
        }
        arr = new  Integer[initSize];
        size = 0;
        start = 0;
        end =  0;
    }
    public Integer peek(){
        if (size == 0){
            return null;
        }
        return arr[start];
    }
    public void push(int n){
        if (size == arr.length){
            throw new ArrayIndexOutOfBoundsException("");
        }
        size ++;
        arr[end] = n;
        end = end == arr.length - 1 ? 0 : end + 1;
    }
    public Integer poll(){
        if (size == 0){
            throw new ArrayIndexOutOfBoundsException("");
        }
        size --;
        int temp = start;
        start = start == arr.length - 1 ? 0 :start + 1;
        return arr[temp];
    }
}
