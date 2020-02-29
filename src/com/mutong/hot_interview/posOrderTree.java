package com.mutong.hot_interview;

/**
 * @description: 树的后序遍历
 * @Author: Mutong
 * @Date: 2020-02-29 23:13
 * @time_complexity: O()
 */
public class posOrderTree {
    public  void posOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.print(head.val + " ");
    }
}
