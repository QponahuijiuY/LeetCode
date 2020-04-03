package com.mutong.offer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-03 11:09
 * @time_complexity: O()
 */
public class LastRemaining_Solution {
    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(10, 3));
    }
    public static int LastRemaining_Solution(int n, int m) {

        if(n==0) return -1;
        int s=0;
        for(int i=2;i<=n;i++){s=(s+m)%i;}
        return s;

    }
}
