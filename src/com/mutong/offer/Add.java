package com.mutong.offer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-03 11:17
 * @time_complexity: O()
 */
public class Add {
    public static void main(String[] args) {
        System.out.println(Add(1, 2));
        System.out.println(1&3);
    }
    public static int Add(int num1,int num2) {
        while (num2!=0) {
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }
}
