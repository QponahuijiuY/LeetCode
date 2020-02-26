package com.mutong.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-25 23:26
 * @time_complexity: O()
 */
public class LvelOrder {
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[]{};
        }
        List<TreeNode> list = new ArrayList();
        int i = 0;
        list.add(root);
        while(i < list.size()){
            TreeNode mid = list.get(i);
            if (mid.left != null){
                list.add(mid.left);
            }
            if (mid.right!=null){
                list.add(mid.right);
            }
            i++;
        }
        int[] res = new int[list.size()];
        for (int j = 0 ; j < list.size() ; j ++){
            res[j] = list.get(j).val;
        }
        return res;
    }
}
