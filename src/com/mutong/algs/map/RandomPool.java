package com.mutong.algs.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-19 22:51
 * @time_complexity: O()
 */
public class RandomPool {
    Map<String, Integer> map1;
    Map<Integer, String> map2;
    int size;
    public static void main(String[] args) {

    }

    public RandomPool(){
        map1 = new HashMap();
        map2 = new HashMap();
        size = 0;
    }
    public void add(String str){
        map1.put(str,size);
        map2.put(size,str);
        size ++;
    }
    public String getRandom(){
        if (size == 0){
            return null;
        }
        int index = (int) (Math.random() * size);
        return map2.get(index);
    }
}
