package com.mutong.algs.sort;

/**
 * @description: 快速排序:取数组的最后一个数为参照点,把小于它的都放在左边,比他大的都放在右边,最后把最后一个参照点交换到中间
 * @Author: Mutong
 * @Date: 2020/2/25 13:52
 * @time_complexity: O(nlgn)
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {2,13,1,5,99,234,23};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
    public static void sort(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }
        quicksort(nums, 0 , nums.length - 1);
    }

    //分成两个部分,递归的进行快排, 以最后一个元素为参照点, 小于它的放在左边,大于它的放在右边, 中间是所有相等的元素
    private static void quicksort(int[] nums, int L, int R) {
        if (L >= R){
            return;
        }
        int more = partition(nums,L,R);
        quicksort(nums, L, more-1);
        quicksort(nums, more+1 ,R);


    }

    private static int partition(int[] nums, int L, int R) {
        int less = L;
        int more = R + 1;
        int value = nums[L];//以第一个元素作为划分
        while (true){
            while (nums[++less] < value) if (less == R) break;
            while (nums[--more] > value) if (more == L) break;
            if (more <= less) break;
            swap(nums,less,more);
        }
        swap(nums,L,more);


        return more;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
