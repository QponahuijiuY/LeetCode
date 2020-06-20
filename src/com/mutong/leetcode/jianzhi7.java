package com.mutong.leetcode;

import java.util.Arrays;

/**
 * @description: 重建二叉树
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-18 11:09
 */
public class jianzhi7 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                break;
            }
        }
        return root;
    }
}
