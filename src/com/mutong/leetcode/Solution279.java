package com.mutong.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @description: 完全平方数
 * @Author: Mutong
 * @Date: 2020-04-27 16:51
 * @time_complexity: O()
 */
public class Solution279 {
    public static void main(String[] args) {
        Solution279 solution = new Solution279();
        System.out.println(solution.numSquares(30));
    }
    public int numSquares(int n) {
        return bfs(n);
    }

    private int bfs(int n){
        int level = 0;
        Queue<Integer> queue = new LinkedList();
        Set<Integer> used = new HashSet();
        queue.add(n);
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            for(int i = 0 ;i < size; i ++){
                int cur = queue.poll();
                //judgt
                for(int j = 1; j * j <= cur; j ++){
                    int next = cur - j * j;
                    if(next == 0){
                        return level;
                    }
                    if(!used.contains(next)){
                        queue.add(next);
                        used.add(next);
                    }
                }
            }
        }
        return -1;
    }
}