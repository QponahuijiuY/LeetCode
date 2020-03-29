package com.mutong.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 从上到下打印链表
 * @Author: Mutong
 * @Date: 2020-03-28 17:46
 * @time_complexity: O()
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            array.add(node.val);
            if (node.left != null){
                queue.add(root.left);
            }
            if (node.right != null){
                queue.add(root.right);
            }
        }
        return array;
    }
}
