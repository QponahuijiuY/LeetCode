package com.mutong.leetcode;

import com.mutong.offer.TreeNode;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-28 18:16
 * @time_complexity: O()
 */
public class Solution104 {
    public int maxDepth(TreeNode root){
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
