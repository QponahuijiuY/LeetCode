package com.mutong.offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description: 把数组排成最小的数
 * 题目描述
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * @Author: Mutong
 * @Date: 2020-04-01 14:47
 * @time_complexity: O()
 */
public class PrintMinNumber {
    public static void main(String[] args) {
        PrintMinNumber printMinNumber = new PrintMinNumber();
        int [] numbers = {3,32,321};
        System.out.println(printMinNumber.PrintMinNumber(numbers));
    }
    public String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) {return "";}
        int len = numbers.length;
        String[] str = new String[len];
        //整数数组转化为字符串数组
        for (int i = 0; i < len; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        //排序
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //两个值相加,小的放在前面
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }
}
