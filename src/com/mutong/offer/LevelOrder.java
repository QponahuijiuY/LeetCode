package com.mutong.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-25 23:36
 * @time_complexity: O()
 */
public class LevelOrder {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root == null) {return new ArrayList(0);}
        ArrayList<TreeNode> list = new ArrayList();
        int i = 0;
        list.add(root);
        while(i < list.size()){
            TreeNode cur = list.get(i);
            if (cur.left != null){
                list.add(cur.left);
            }
            if (cur.right != null){
                list.add(cur.right);
            }
            i++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int j = 0 ;j < list.size() ; j++){
            res.add(list.get(j).val);
        }
        return res;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size=  queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size ; i ++){
                TreeNode mid = queue.poll();
                list.add(mid.val);
                if (mid.left != null){
                    queue.add(mid.left);
                }
                if (mid.right != null){
                    queue.add(mid.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
