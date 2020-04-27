package com.mutong.bishi.youyi;

import java.util.Stack;

/**
 * @description:  判断括号是否匹配
 * @Author: Mutong
 * @Date: 2020-04-13 15:53
 * @time_complexity: O()
 */
public class shibi1 {
    //使用一个栈,先把所有的左括号入栈
    //对于下一个字符,判断其栈顶的元素是否是与之相匹配的字符,比如说是 '{' 就判断栈顶元素是否是'}',是就让栈顶元素出栈
    //结束的时候刚好栈为空说明括号是匹配的,否则false
    public static boolean judge(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(judge("({[]})"));
        System.out.println(judge("({]})"));
        System.out.println(judge("({})"));
    }
}
