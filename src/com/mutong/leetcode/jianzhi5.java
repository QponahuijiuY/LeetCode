package com.mutong.leetcode;

/**
 * @description: 替换空格
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-18 10:49
 */
public class jianzhi5 {
    public String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                sb.append("%20");
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
