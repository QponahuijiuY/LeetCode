package com.mutong.bishi.zhongkeruan;

import java.util.Scanner;

/**
 * @description: 计算阶乘
 * @Author: Mutong
 * @Date: 2020-04-11 23:11
 * @time_complexity: O()
 */
public class Factorial {
    public static void main(String[] args) {
        //判断输出值为几时会溢出
        int i = judge();

        Scanner sc = new Scanner(System.in);
        //输入n组数据
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            //每1组数据
            int res = sc.nextInt();
            //如果说输入的值比上面判断溢出的值小,那么直接计算,如果输入的值比上面判断的值大,显示溢出
            if (res < i){
                System.out.println(factorial(res));
            }else {
                System.out.println("输入"+res+"时溢出了");
            }
        }

    }

    //计算阶乘
    public static long factorial(int n){
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    //判断何时溢出
    public static int judge(){
        long s = 1;
        int i ;
        for (i = 1; i < 127; i++) {
            s *= i;
            //溢出时会变成负值
            if (s < 0) {
                System.out.println("当输入的值大于等于"+i+"时会溢出");
                break;
            }
        }
        return i;
    }
}
