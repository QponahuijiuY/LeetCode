package com.mutong.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: 扑克牌的顺序
 * @Author: Mutong
 * @Date: 2020-04-03 10:49
 * @time_complexity: O()
 */
public class IsContinuous {

    public static void main(String[] args) {
        int[] ints = {1, 0, 3, 0, 5};
        System.out.println(isContinuous(ints));
    }
    public static boolean isContinuous(int [] numbers) {
        if(numbers.length == 0) return false;
        Set<Integer> set = new HashSet<>();
        int maxn = -1, minn = 14;
        for(int a: numbers)
        {
            //添加不成功,并且a!=0, 说明有重复的元素,,返回false
            if(!set.add(a) && a!=0) return false;
            if(a!=0) {
                maxn = Math.max(maxn, a);
                minn = Math.min(minn, a);
            }
        }
        if(maxn - minn <=4) return true;
        return false;

    }
}

