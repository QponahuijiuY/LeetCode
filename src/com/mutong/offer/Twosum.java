package com.mutong.offer;

import java.util.HashMap;

/**
 * @description: 两数之和
 *
 * @Author: Mutong
 * @Date: 2020-03-14 23:31
 * @time_complexity: O()
 */
public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int left = 0,right = nums.length-1;
        while(left<right){
            int value = nums[left]+nums[right];
            if(value == target){
                res[0] = nums[left];
                res[1] = nums[right];
                break;
            }else if(value<target){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }

    public int[] twoSum2(int[] nums, int target) {
        if (nums.length == 0){
            return new int[]{-1,-1};
        }
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0;i<nums.length;i++){
            int res = target - nums[i];
            if (map.containsKey(res)){
                return new int[]{map.get(res),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
