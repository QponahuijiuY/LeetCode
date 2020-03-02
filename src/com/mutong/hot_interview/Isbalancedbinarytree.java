package com.mutong.hot_interview;

/**
 * @description: 判断一棵树是不是平衡二叉树
 * @Solution: 三个步骤:1.判断左子树是不是平衡二叉树2.判断右子树是不是平衡二叉树3.判断左子树的高度和右子树的高度
 * @Author: Mutong
 * @Date: 2020-03-02 21:38
 * @time_complexity: O()
 */
public class Isbalancedbinarytree {
    public boolean Isbalancedbinarytree(TreeNode root) {
        if (root == null) return true;
        //判断左子树不为空,并且右子树不为空,并且高度差小于2才会平衡二叉树
        return Math.abs(height(root.left) - height(root.right)) < 2
                && Isbalancedbinarytree(root.left)
                && Isbalancedbinarytree(root.right);
    }

    //判断一棵树的高度,左子树的高度加上右子树的高+1就是一棵树的高度
    private int height(TreeNode root) {
        if (root == null) return -1;
        return Math.max(height(root.left) ,height(root.left)) + 1;
    }


}



