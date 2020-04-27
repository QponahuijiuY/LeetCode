package com.mutong.algs.search;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-04 18:16
 * @time_complexity: O()
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(nums, 9));
    }

    public static int search(int[] nums, int k){
        if (nums == null || nums.length < 1){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (k < nums[mid]){
                end = mid - 1;
            }else if (k > nums[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;

    }
}
