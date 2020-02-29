package com.mutong.hot_interview;

/**
 * @description: 树的中序遍历
 * @Author: Mutong
 * @Date: 2020-02-29 23:05
 * @time_complexity: O()
 */
public class InOrderTree {
    public void inOrderRecur(TreeNode head){
        if (head == null) {
            return;
        }
        inOrderRecur(head.left);
        System.out.print(head.val + " ");
        inOrderRecur(head.right);
    }
}
