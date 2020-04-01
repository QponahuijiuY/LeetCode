package com.mutong.offer;

import java.util.Stack;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-24 15:55
 * @time_complexity: O(n)
 */
public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else{
                return false;

            }
        }
        return stack.isEmpty();
    }
}
