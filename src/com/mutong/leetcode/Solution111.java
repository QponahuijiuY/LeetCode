package com.mutong.leetcode;

import com.mutong.offer.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 树的最小深度
 * 广度优先搜索:第一个被访问到的叶子节点就是最小深度的节点,返回层数即可
 * @Author: Mutong
 * @Date: 2020-04-28 16:49
 * @time_complexity: O()
 */
public class Solution111 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.right = new TreeNode(13);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(1);
        Solution111 solution = new Solution111();
        System.out.println(solution.minDepth(root));
    }
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){return 0;}
        int step = 1;
        queue.add(root);
        while (!queue.isEmpty()){
            step ++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.peek();
                if (cur.left == null && cur.right == null){
                    break;
                }
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
                queue.remove();
            }
        }
        return step;
    }


}
