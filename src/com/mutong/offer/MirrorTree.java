package com.mutong.offer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-25 22:41
 * @time_complexity: O()
 */
public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        //递归函数的终止条件，节点为空时返回
        if(root==null) {
            return null;
        }
        //交换左右节点
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        //递归交换当前节点的 左子树
        mirrorTree(root.left);
        //递归交换当前节点的 右子树
        mirrorTree(root.right);
        return root;
    }
}
