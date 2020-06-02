package com.mutong.leetcode;

import com.mutong.offer.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description: 树的前序遍历
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-02 17:24
 */
public class Solution144 {

    public List<Integer> preorderTraversal(TreeNode root) {
            if (root == null) {return null;}
            Stack<TreeNode> stack = new Stack();
            List<Integer> res = new ArrayList();
            stack.push(root);
            TreeNode cur;
            while(!stack.isEmpty()){
                cur = stack.pop();
                res.add(cur.val);
                if (cur.right != null){
                    stack.push(cur.right);
                }
                if (cur.left != null){
                    stack.push(cur.left);
                }

            }
            return res;
    }
}
