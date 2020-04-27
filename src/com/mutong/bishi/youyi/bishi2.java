package com.mutong.bishi.youyi;


/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-13 16:07
 * @time_complexity: O()
 */

public class bishi2 {
    public static boolean judge(TreeNode root){
        if (root == null){
            return false;
        }
        return help(root.left, root.right);
    }

    private static boolean help(TreeNode left, TreeNode right) {
        return help(left.left,left.right) && help(right.left,right.right);
    }
}
class TreeNode {
    public boolean val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(boolean val) {
        this.val = val;
    }
}

