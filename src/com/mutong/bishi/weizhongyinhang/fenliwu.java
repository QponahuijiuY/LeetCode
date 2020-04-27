package com.mutong.bishi.weizhongyinhang;

import java.util.Scanner;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-08 19:27
 * @time_complexity: O()
 */
public class fenliwu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (n % m == 0 && m != 1){

            System.out.println(0);
            return;
        }
        int y = n - m % n;
        int q1 = y * a;
        int q2 = y * b;
        int q = q1 < q2 ? q1 : q2;
        System.out.println(q);
    }
}
