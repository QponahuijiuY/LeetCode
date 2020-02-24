package com.mutong.algs.sort;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/24 22:20
 * @time_complexity: O()
 */
public class SelectionSort {
    public void sort(int[] nums) {
        int n = nums.length;
        if (nums == null || n < 2) return;
        for (int i = 0; i < n - 1; i++) {
            //假设i=0时是最小值,看i+1对应的值是否小于0对应的值,是交换,否i++
            int minIndex = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
                swap(nums, i, minIndex);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}



