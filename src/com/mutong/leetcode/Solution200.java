package com.mutong.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 岛屿数量
 * @Author: Mutong
 * @Date: 2020-04-27 15:11
 * @time_complexity: O()
 */
public class Solution200 {
    public static void main(String[] args) {
        Solution200 solution = new Solution200();
        char[][] grid={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println(solution.numIslands(grid));
    }
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        //init
        int nr = grid.length;//行数
        int nc = grid[0].length;//列数
        int num_islands = 0;//岛屿的数量
        for(int i = 0 ; i < nr ; i ++){
            for(int j = 0 ; j < nc ; j ++){
                if(grid[i][j] == '1'){
                    bfs(grid, i, j);
                    num_islands++;
                }
            }
        }
        return num_islands;
    }
    private void bfs(char[][] grid, int i, int j){
        Queue<int[]> list = new LinkedList<>();
        //add to queue
        list.add(new int[]{i,j});
        while(!list.isEmpty()){
            int[] cur = list.peek();
            i = cur[0];
            j = cur[1];

            if(0 <= i && i < grid.length && 0 <= j && j < grid[0].length && grid[i][j] == '1') {
                grid[i][j] = '0';
                list.add(new int[] { i + 1, j });
                list.add(new int[] { i - 1, j });
                list.add(new int[] { i, j + 1 });
                list.add(new int[] { i, j - 1 });
            }
            //remove the first from queue
            list.remove();
        }
    }
}