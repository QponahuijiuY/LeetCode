package com.mutong.offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @description: 滑动窗口的最大值
 * @Author: Mutong
 * @Date: 2020-03-24 17:46
 * @time_complexity: O()
 */
public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] num = {2,3,4,2,6,2,5,1};
        System.out.println(maxInWindows1(num, 3));
    }
    public static ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> res = new ArrayList();
        if (num.length == 0){
            return res;
        }
        LinkedList<Integer> list = new LinkedList();
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            while (!list.isEmpty() && num[list.peekLast()]<num[i]){
                list.pollLast();
            }
            list.addLast(i);
            if (list.peekFirst() == i - size){
                list.pollFirst();
            }
            if (i >= size - 1){
                res.add(num[list.peekFirst()]);
            }
        }
        return res;
    }
    public static ArrayList<Integer> maxInWindows1(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || size <= 0 || num.length < size) {
            return res;
        }
        // 暴力破解法
        int len = num.length;
        int maxIdx = len - size;
        for (int i=0; i<= maxIdx; i++) {
            // 获取当前序列的最大值
            int curMax = num[i];
            for (int j=i+1; j<i+size; j++) {
                curMax = curMax > num[j] ? curMax : num[j];
            }
            // 最大值加入res
            res.add(curMax);
        }

        return res;
    }

}
