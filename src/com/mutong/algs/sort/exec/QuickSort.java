package com.mutong.algs.sort.exec;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-04 12:58
 * @time_complexity: O()
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,2,6,2,5,1,8,6,6};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void sort(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }
        quicksort(nums, 0 ,nums.length-1);
    }

    private static void quicksort(int[] nums, int L, int R) {
        if (L >= R){
            return;
        }
        int mid = partition(nums,L,R);
        quicksort(nums,L,mid-1);
        quicksort(nums,mid + 1, R);
    }

    //
    private static int partition(int[] nums, int L, int R) {
        int i = L;
        int j = R + 1;
        int mid = nums[L];
        while (true){
            while (nums[++i] < mid) if (i == R) break;
            while (nums[--j] > mid) if (j == L) break;
            if (j <= i) break;
            swap(nums,i,j);
        }
        swap(nums,L,j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
