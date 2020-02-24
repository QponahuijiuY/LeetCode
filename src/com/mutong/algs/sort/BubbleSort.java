package com.mutong.algs.sort;

/**
 * @description: 冒泡排序:首先比较0和1位置上的数,前面比后面大则交换,然后比较1和2位置上的数,依次类推
 * @Author: Mutong
 * @Date: 2020/2/24 21:55
 * @time_complexity:
 */
public class BubbleSort {

    public void sort(int[] nums){
        int n = nums.length;
        if (nums == null || n < 2) return;
        //每进行依次冒泡排序,最后一位上的数字永远是最大的
        for (int end = n - 1 ; end > 0 ; end --){
            for (int i = 0 ; i < end ; i ++){
                if (nums[i + 1] < nums[i]){
                    swap(nums, i, i + 1);
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
