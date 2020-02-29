package com.mutong.hot_interview;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-29 23:08
 * @time_complexity: O()
 */
public class PreOrderTree {
    public void preOrderTree(TreeNode head){
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        preOrderTree(head.left);
        preOrderTree(head.right);
    }
}
