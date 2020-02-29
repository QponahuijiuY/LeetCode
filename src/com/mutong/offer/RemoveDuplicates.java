package com.mutong.offer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-28 22:21
 * @time_complexity: O()
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}
