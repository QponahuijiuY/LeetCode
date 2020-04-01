package com.mutong.bishi.kuaishou;

import java.util.Scanner;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-29 19:54
 * @time_complexity: O()
 */
public class zuidagongyueshu {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n){
            for (int j = i; j <= n; j++){
                int w = j + 1;
                if (w <= n){
                    int q = j++ * w++;
                    if (q >= sum){
                        sum = q;
                    }
                }

            }
            i++;
        }

        System.out.println(sum - 1);
    }
}
