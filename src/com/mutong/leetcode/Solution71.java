package com.mutong.leetcode;

import java.util.Stack;

/**
 * @description: 简化路径
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-20 9:15
 */
public class Solution71 {
    public static void main(String[] args) {
        Solution71 solution = new Solution71();
        System.out.println(solution.simplifyPath("/home/"));

    }

    public String simplifyPath(String path) {
        String[] str = path.trim().split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            if (!stack.isEmpty() && str[i].equals("..")) {
                stack.pop();
            } else if(!str[i].equals("") && !str[i].equals(".") && !str[i].equals("..")) {
                stack.push(str[i]);
            }
        }
        if (stack.isEmpty()){
            return "/";
        }
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < stack.size(); i++) {
            res.append("/" + stack.get(i));
        }
        return res.toString();

    }
}
