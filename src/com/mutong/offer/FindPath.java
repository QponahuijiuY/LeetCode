package com.mutong.offer;

import java.util.ArrayList;

/**
 * @description: 二叉树中和为某一个值的路径
 * @Author: Mutong
 * @Date: 2020-03-29 10:21
 * @time_complexity: O()
 */
public class FindPath {
    ArrayList<ArrayList<Integer>> array;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        array = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return array;
        }
        FindPathhelper( new ArrayList<Integer>(), root, target,0);
        return array;
    }

    private void FindPathhelper(ArrayList<Integer> arr ,TreeNode root, int sum, int cur){
        cur += root.val;
        arr.add(root.val);
        if( sum == cur && root.left == null && root.right == null){
            array.add(new ArrayList(arr));
        }
        if(root.left != null){
            FindPathhelper(arr, root.left,sum ,cur);
            arr.remove(arr.size() - 1);
        }
        if(root.right != null){
            FindPathhelper(arr, root.right,sum ,cur);
            arr.remove(arr.size() - 1);
        }
    }
}
