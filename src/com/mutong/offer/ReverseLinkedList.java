package com.mutong.offer;

/**
 * @description: 反转链表
 * @Author: Mutong
 * @Date: 2020-03-02 22:41
 * @time_complexity: O()
 */
public class ReverseLinkedList {

    //递归
    public ListNode reverseLinkedList(ListNode head){
        if (head == null && head.next == null) return head;
        ListNode cur = reverseLinkedList(head.next);
        head.next.next=head;
        head.next=null;
        return cur;
    }

    //非递归
    public ListNode reverseLinkedList2(ListNode head){
        if (head == null && head.next == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next=pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}

