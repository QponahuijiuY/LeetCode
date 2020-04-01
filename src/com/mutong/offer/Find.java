package com.mutong.offer;

/**
 * @description: 二维数组的查找
 *
 * @Author: Mutong
 * @Date: 2020-03-28 10:37
 * @time_complexity: O()
 */
public class Find {
    public boolean Find(int target, int [][] array) {
        if(array != null && array.length > 0 && array[0].length > 0){
            int i = 0; //行
            int j = array[0].length - 1; //列
            while(i <= array.length -1 && j >= 0){
                if(array[i][j] < target){
                    i++;
                }else if(array[i][j] > target){
                    j--;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
