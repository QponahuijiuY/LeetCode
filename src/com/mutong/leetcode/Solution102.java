package com.mutong.leetcode;

import com.mutong.offer.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-28 15:37
 * @time_complexity: O()
 */
public class Solution102 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(levelOrder(root));
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        List<List<Integer>> list = new ArrayList();
        queue.add(root);
        int step = 0;
        while(!queue.isEmpty()){
            list.add(new ArrayList<Integer>());
            step++;
            int size = queue.size();
            for(int i = 0 ; i < size ; i ++){
                TreeNode cur = queue.peek();
                list.get(step-1).add(cur.val);
                if(cur.left != null)  queue.add(cur.left);
                if(cur.right != null)  queue.add(cur.right);
                queue.remove();
            }
        }
        return list;
    }
}
