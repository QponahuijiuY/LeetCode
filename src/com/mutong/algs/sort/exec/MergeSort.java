package com.mutong.algs.sort.exec;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-04 11:55
 * @time_complexity: O()
 */
public class MergeSort {
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
        mergeSort(nums,0,nums.length - 1);
    }

    private static void mergeSort(int[] nums, int L, int R) {
        if (L >= R){
            return;
        }
        int mid = (L + R )/ 2;
        mergeSort(nums,L,mid);
        mergeSort(nums,mid+1,R);
        merge(nums,L,mid,R);
    }

    private static void merge(int[] nums, int L, int mid, int R) {
        int pA = L;
        int pB = mid + 1;
        int i = 0;
        int[] help = new int[R - L + 1];
        while (pA <= mid && pB <= R){
            help[i++] = nums[pA] < nums[pB] ? nums[pA++] : nums[pB++];
        }
        while (pA <= mid){
            help[i++] = nums[pA++];
        }
        while (pB <= R){
            help[i++] = nums[pB++];
        }
        for (int j = 0; j < help.length; j++) {
            nums[L + j] = help[j];
        }
    }
}
