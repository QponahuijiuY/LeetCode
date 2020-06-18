package com.mutong.leetcode;



import java.util.ArrayList;
import java.util.Stack;

/**
 * @description: 从头到尾打印链表
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-18 10:55
 */
public class jianzhi6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        ListNode cur = listNode;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while (!stack.isEmpty()){
            res.add(stack.pop().val);
        }
        return res;
    }
}


