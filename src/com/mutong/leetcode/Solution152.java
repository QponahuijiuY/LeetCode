package com.mutong.leetcode;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-05-01 21:26
 * @time_complexity: O()
 */
public class Solution152 {
    public static void main(String[] args) {
        Solution152 solution = new Solution152();
        System.out.println(solution.maxProduct(new int[]{2, 3, -2, 4}));
    }
    public int maxProduct(int[] nums) {
        //int[] max = new int[nums.length];
        //int[] min = new int[nums.length];
        int max = 1;
        int min = 1;
        int resmax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                int tem = max;
                max = min;
                min = tem;
            }
            max = Math.max(max * nums[i],nums[i]);
            min = Math.min(min * nums[i],nums[i]);
            resmax = Math.max(max,resmax);
        }
        return resmax;
    }
    public int maxProduct1(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }


}
