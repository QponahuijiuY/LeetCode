package com.mutong.offer;

import java.util.Arrays;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-01 14:20
 * @time_complexity: O()
 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        Arrays.sort(array);
        int mid = array[len / 2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == mid){
                count ++;
            }
        }
        if (count > len/2){
            return mid;
        }
        return mid;


        /*
        int len = array.length;
        Arrays.sort(array);
        int num = array[len/2];

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (num == array[i])
                count++;
        }
        if (count <= len/2){
            return 0;
        }
        return num;*/
    }
}
