package com.mutong.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-28 19:31
 * @time_complexity: O()
 */
public class Solution22 {
    public static void main(String[] args) {
        Solution22 solution = new Solution22();
        System.out.println(solution.generateParenthesis(5));
    }
    List<String> result;
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<String>();
        recur(0, 0 ,n ,"");
        return result;
    }

    private void recur(int left, int right, int n,String s) {

        if (left == n && right == n){
            result.add(s);
            return;
        }

        if (left < n ){
            String s1 = s + "(";
            recur(left + 1,right,n, s1);
        }
        if (left > right){
            String s2 = s + ")";
            recur(left,right + 1,n, s2);
        }


    }
}
