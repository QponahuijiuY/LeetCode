package com.mutong.offer;

/**
 * @description: 将一个二叉树转换为链表, 只改变指针的相对位置,不允许使用其他的数据结构
 * @Author: Mutong
 * @Date: 2020-03-29 11:22
 * @time_complexity: O()
 */
public class Convert {
    public TreeNode Convert(TreeNode root) {
        //判断非空
        if (root == null) { return null;}
        if (root.left == null && root.right == null) { return root;}
        TreeNode left = Convert(root.left);
        TreeNode cur = left;
        while (cur != null && cur.right != null){
            cur = cur.right;
        }
        if (left != null){
            cur.right = root;
            root.left = cur;
        }
        TreeNode right = Convert(root.right);
        if (right != null){
            root.right = right;
            right.left = root;
        }
        return left != null ? left : root;
    }
}
