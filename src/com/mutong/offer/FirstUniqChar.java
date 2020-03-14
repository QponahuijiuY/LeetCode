package com.mutong.offer;

/**
 * @description: 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
 *
 * 示例:
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = ""
 * 返回 " "
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: Mutong
 * @Date: 2020-03-15 0:43
 * @time_complexity: O()
 */
public class FirstUniqChar {
    public char firstUniqChar(String s) {
        int[] count = new int[26];
        //为每一个字符串设值为1,当出现两次的时候,值为2,出现三次,值为3
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        for(char c : s.toCharArray()){
            //再次遍历,第一个值为1的就输出
            if (count[c - 'a'] == 1) return c;
        }
        return ' ';
    }

    public static void main(String[] args) {
        FirstUniqChar firstUniqChar = new FirstUniqChar();
        char leetcode = firstUniqChar.firstUniqChar("leetcode");
        System.out.println(leetcode);
    }
}
