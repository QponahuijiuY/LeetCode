package com.mutong.leetcode.huisu;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 全排列
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-28 19:26
 */
public class Solution46 {
    //list 中间变量
    //res 结果
    //used 用来判断当前是否被前面使用过了
    List<Integer> list;
    List<List<Integer>> res;
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        list = new ArrayList();
        if (nums.length == 0 || nums == null){
            return res;
        }
        res = new ArrayList();
        used = new boolean[nums.length];
        helper(nums,0);
        return res;
    }
    private void helper(int[] nums,int index){
        if(index == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0;i < nums.length;i++){
            if (!used[i]){
                list.add(nums[i]);
                used[i] = true;
                helper(nums,index+1);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }

    }
    public static void main(String[] args) {
        Solution46 solution = new Solution46();
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> permute = solution.permute(nums);
        System.out.println(permute);
    }
}