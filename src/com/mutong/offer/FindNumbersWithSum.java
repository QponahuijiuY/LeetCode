package com.mutong.offer;

import java.util.ArrayList;

/**
 * @description: 和为s的两个数
 *
 * 题目描述
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 输出描述:
 * 对应每个测试案例，输出两个数，小的先输出。
 * @Author: Mutong
 * @Date: 2020-04-01 21:24
 * @time_complexity: O()
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int i = 0,j = array.length - 1;
        ArrayList<Integer> list = new ArrayList();
        while (i < j){
            if (array[i] + array[j] == sum){
                list.add(array[i]);
                list.add(array[j]);
                break;
            }else if (array[i] + array[j] > sum){
                --j;
            }else {
                ++i;
            }
        }
        return list;

    }
}
