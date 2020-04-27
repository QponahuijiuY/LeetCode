package com.mutong.bishi.wangyi;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-07 19:36
 * @time_complexity: O()
 */

import java.util.Scanner;

public class dengchashulie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        long[] nums = new long[n];
        long[] res = new long[n-1];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextLong();
        }
        long d = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1] || nums[i] < nums[i-1]){
                System.out.println(-1);
                return;
            }
            long c = nums[i] - nums[i-1];
            res[i-1] = c;
        }
        long gcd = 0;
        for (int i = 1; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if (i!=j){
                    long s = gcd(res[i], res[j]);
                    gcd = s < gcd ?  gcd : s;
                }
            }
        }
        System.out.println(gcd);
//        int i = 1;
//        long gcd = 0;
//        long s = 0;
//        while (i++ < n-2){
//            for (int j = 1; j < res.length; j++) {
//                s = gcd(res[i - 1], res[i]);
//            }
//            gcd = s < gcd ? gcd : s;
//        }

    }
    private static long gcd(long a,long b){
        return (b==0)?a:gcd(b,a%b);
    }
}
