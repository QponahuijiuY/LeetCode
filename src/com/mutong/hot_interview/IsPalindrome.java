package com.mutong.hot_interview;

import java.util.Stack;

/**
 * @description: 判断一个链表是不是回文链表
 * @Author: Mutong
 * @Date: 2020-02-28 11:55
 * @time_complexity: O()
 */
public class IsPalindrome {
    public boolean isPalindrome1(ListNode head) {
        //使用一个栈,先把所有的节点全部入栈,然后从头遍历节点,再依次对比出栈的元素
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null){
            if (head.val != stack.pop().val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
