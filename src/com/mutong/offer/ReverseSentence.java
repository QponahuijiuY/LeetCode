package com.mutong.offer;

import java.util.Stack;

/**
 * @description: 翻转单词顺序序列
 *
 * @Author: Mutong
 * @Date: 2020-04-03 10:03
 * @time_complexity: O()
 */
public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println(ReverseSentence("student. a am I"));
    }

    public static String ReverseSentence(String str) {
        if(str == " "){
            return " ";
        }
        if (str == null ) {
            return null;
        }

        if (str.length() == 1){
            return str;
        }
        Stack stack = new Stack();
        //对原始字符串做处理,trim()的作用是删除字符串前面和后面的空格
        String newstr = str.trim();
        //把处理后的字符串按split划分,得到一个字符数组
        String[] s = newstr.split(" ");
        //按顺序入栈
        for (int i = 0; i < s.length ; i++) {
            stack.push(s[i]);
        }
        String pop = (String) stack.pop();
        while (!stack.isEmpty()){

            pop = pop  + " " + stack.pop();
        }
        return pop;
    }
}
