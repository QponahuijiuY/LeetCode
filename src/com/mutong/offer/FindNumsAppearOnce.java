package com.mutong.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-01 19:01
 * @time_complexity: O()
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Set set = new HashSet();
        for (int a:array){
            if(set.contains(a)) {set.remove(a);}
            else {set.add(a);}
        }
        num1[0] = (int)set.toArray()[0];
        num2[0] = (int)set.toArray()[1];
    }
}
