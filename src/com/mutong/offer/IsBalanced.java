package com.mutong.offer;

/**
 * @description: 判断一棵树是否是平衡树
 * @Author: Mutong
 * @Date: 2020-02-25 22:57
 * @time_complexity: O()
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        return Math.abs(height(root.left) - height(root.right)) < 2
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }


}
