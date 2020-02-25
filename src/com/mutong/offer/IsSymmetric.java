package com.mutong.offer;

/**
 * @description: 力扣__对称二叉树
 * @Author: Mutong
 * @Date: 2020-02-25 22:17
 * @time_complexity: O()
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return helper(root.left,root.right);
    }
    private boolean helper(TreeNode left, TreeNode right) {
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        if(left.val==right.val)
            return helper(left.left, right.right) && helper(left.right, right.left);
        return false;
    }
}
