package com.mutong.hot_interview;

import java.util.Stack;

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
    public void preOrderTree2(TreeNode head){
        if(head != null){
            Stack<TreeNode> stack = new Stack<>();
            stack.add(head);
            while (!stack.isEmpty()){
                head = stack.pop();
                System.out.println(head.val + " ");
                if (head.right != null){
                    stack.push(head.right);
                }
                if (head.left != null){
                    stack.push(head.left);
                }
            }
        }
    }
}
