package com.mutong.bishi.renrenche;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-24 18:43
 */
public class kuaileshu {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
        System.out.println(isHappyNumber(39));
        System.out.println(isHappyNumber(49));
        System.out.println(isHappyNumber(89));
    }
    //求每一位平方和
    private static int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int i = n % 10;
            n = n / 10;
            sum += i * i;
        }
        return sum;
    }
    private static boolean isHappyNumber(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSum(n);
        }
        return n == 1;
    }
}
