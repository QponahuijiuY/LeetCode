package com.mutong.bishi.kuaishou;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @description:
 *
 * 第一行是一个整数k，表示子串中有k个1就有可能是病毒。其中 0 <= k <= 1 000 000
 *
 * 第二行是一个字符串，就是library的代码部分的二进制表示。字符串长度 <= 1 000 000。并且字符串中只包含"0"或"1".
 *
 *
 * 输出描述:
 * 输出一个整数，所有满足只包含k个1的子串的个数。
 * 示例1
 * 输入
 * 1
 * 1010
 * 输出
 * 6
 * @Author: Mutong
 * @Date: 2020-03-20 8:55
 * @time_complexity: O()
 */
public class Bing_Du_Jian_Ce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String l2 = sc.nextLine();
        //有k个元素就是病毒
        int k = Integer.parseInt(l1);
        //生成字符数组
        char[] arr = l2.toCharArray();
        int num = 0;
        long ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == '1') {
                num++;
            }
            if (map.containsKey(num - k)) {
                ans +=map.get(num-k);
            }
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        System.out.println(ans);
    }
}
