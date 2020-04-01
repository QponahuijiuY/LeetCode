package com.mutong.offer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-01 21:47
 * @time_complexity: O()
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(n>str.length()){
            return "";
        }
        String s1 = str.substring(0,n);
        String s2 = str.substring(n,str.length());
        return s2 + s1;
    }
}
