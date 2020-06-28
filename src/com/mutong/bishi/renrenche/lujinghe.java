package com.mutong.bishi.renrenche;

import com.mutong.leetcode.TreeNode;

/**
 * @description:
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-24 19:05
 */
public class lujinghe {
    static int sum = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(5);
        TreeNode l = new TreeNode(7);
        root.left = left;
        root.right = right;
        root.left.right = l;
        dfs(root,1);
        System.out.println(sum);

    }
    public static void dfs(TreeNode root,int now){
        TreeNode cur = root;
        if (cur.left != null){
            dfs(cur.left,now * 10 + cur.left.val);
        }
        if (root.right != null){
            dfs(cur.right,now * 10 + cur.right.val);
        }
        if (cur.left == null && cur.right ==null){
            System.out.println(now);
            sum += now;
        }
    }

}
