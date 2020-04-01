package com.mutong.offer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-28 12:14
 * @time_complexity: O()
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        String b = Integer.toBinaryString(n);
        char[] chars = b.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] == '1'){
                count++;
            }
        }
        return count;
    }
}
