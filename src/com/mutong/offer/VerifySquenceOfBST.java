package com.mutong.offer;

/**
 * @description: 二叉搜索树的后续遍历序列
 * @Author: Mutong
 * @Date: 2020-03-29 9:57
 * @time_complexity: O()
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        return helper(sequence,0 , sequence.length - 1);
    }
    private boolean helper(int [] sequence,int start , int end){
        if( start >= end) return true;
        //end为根节点   end-1为有孩子节点的最后一个
        int i = end - 1;
        //循环判断第一个大于跟节点的元素, 从 end - 1 向前查找 , 这个i 为第一个大于 根节点的位置下标
        while(sequence[i] > sequence[end] && i > start) i--;
        //二叉搜索树的 左孩子节点一定是比右孩子节点小, 所以如果出现了左孩子比右孩子大,说明不是 二叉搜索树,返回faslse
        for(int j = start ; j < i ; j ++){
            if(sequence[j] > sequence[end]){
                return false;
            }
        }


        return helper(sequence, start, i) && helper(sequence, i+1, end -1);

    }
}
