package com.mutong.offer;

/**
 * @description: 返回链表的中间节点
 * @Author: Mutong
 * @Date: 2020-03-03 22:29
 * @time_complexity: O()
 */
public class MidNode {
    public ListNode middleNode(ListNode head){
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null){
            A[t++] = head;
            head = head.next;
        }
        return A[t/2];
    }

}
