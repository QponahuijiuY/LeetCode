package com.mutong.algs.sort;

/**
 * @description: 插入排序 看1位置上插入那个位置,和0比较; 然后看2位置上的数往哪里插入,若和1交换后,还要和0比较;
 * 看后面的值插在前面那个位置,i位置上的数往前面那个有序中那个位置
 * @Author: Mutong
 * @Date: 2020/2/24 22:40
 * @time_complexity: O(n^2)
 */
public class InsertSort {
    public void sort(int[] nums){
        int n = nums.length;
        if (nums == null || n < 2) return;
        for (int i = 1 ; i < n ; i ++){
            for (int j = i - 1 ; j >= 0 && nums[j] > nums[j + 1] ; j ++){
                swap(nums, j , j + 1);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
