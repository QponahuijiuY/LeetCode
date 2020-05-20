package com.mutong.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 数组中重复的数字
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-21 7:12
 */
public class jianzhi3 {
    public int findRepeatNumber(int[] nums) {
        //时间复杂度O(n),空间复杂度O(n)
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }else {
                map.put(nums[i],i);
            }
        }
        return -1;
    }

    public int findRepeatNumber2(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i){
                if (nums[i] != nums[nums[i]]){
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = i;
                i = temp;

            }
        }
        return -1;
    }


}
