package com.mutong.offer;

import java.util.Arrays;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-28 10:50
 * @time_complexity: O()
 */
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre != null && in != null){
            TreeNode root = new TreeNode(pre[0]);
            for (int i = 0 ; i < in.length; i++){
                if(in[i] == root.val){
                    root.left =  reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1),Arrays.copyOfRange(in, 0 ,i));
                    root.right =  reConstructBinaryTree(Arrays.copyOfRange(pre, i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                    break;
                }
            }
            return root;
        }
        return null;
    }
}
