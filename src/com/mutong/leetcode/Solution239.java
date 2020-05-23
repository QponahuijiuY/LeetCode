package com.mutong.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 滑动窗口的最大值
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-23 14:53
 */
public class Solution239 {
    public static void main(String[] args) {
        Solution239 solution = new Solution239();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(solution.maxSlidingWindow(nums, 3));
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k == 0){
            return new int[]{};
        }
        int[] res = new int[nums.length -k + 1];
        //integer指的是元素的索引
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            //判断队尾元素是不是小于当前元素,小于的话直接删除
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]){
                deque.pollLast();
            }
            //入队当前元素的索引
            deque.offer(i);
            //超出k的范围。弹出队首元素
            if (deque.peek() <= i - k){
                deque.pollFirst();
            }
            if (i + 1 >= k){
                res[i + 1 - k] = nums[deque.peek()];
            }
        }
        return res;
    }

}
