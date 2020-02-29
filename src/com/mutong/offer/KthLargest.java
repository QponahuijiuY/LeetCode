package com.mutong.offer;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @description: 力扣_二叉搜索树的第k小元素
 * @Author: Mutong
 * @Date: 2020-02-27 23:52
 * @time_complexity: O()
 */
public class KthLargest {
    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        TreeNode cur = root;
        //根节点不为空或者stack有数据的时候迭代
        while (cur != null || !stack.isEmpty()){
            //当cur遍历的节点不为空,就一次向下遍历,入栈
            while (cur != null){
                stack.push(cur);
                cur = cur.right;
            }
            //二叉搜索数的性质 ,右子树比左子树节点值要大
            //所以把右边的数字依次入栈就是就是把最大的放在栈顶
            //然后把栈顶元素依次弹出,放进一个链表里面
            cur = stack.pop();
            linkedList.add(cur);
            cur = cur.left;

        }
        return linkedList.get(k-1).val;
    }
}
