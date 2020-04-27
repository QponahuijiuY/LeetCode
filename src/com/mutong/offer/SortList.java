package com.mutong.offer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-06 9:46
 * @time_complexity: O()
 */
public class SortList {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(1);
        head.next.next = new ListNode(8);
        head.next.next.next =  new ListNode(6);
        head.next.next.next.next =new ListNode(9);
        head.next.next.next.next.next =new ListNode(2);
        head.next.next.next.next.next.next =new ListNode(6);
        head.next.next.next.next.next.next.next =new ListNode(7);
        head.next.next.next.next.next.next.next.next =new ListNode(3);
        System.out.println(sortList(head));
    }
    public  static ListNode sortList(ListNode head) {
        if (head == null || head.next == null){ return head; }
        ListNode mid = getMid(head);
        ListNode midNext = mid.next;
        mid.next = null;
        return  mergeSort(sortList(head), sortList(midNext));

    }

    private static ListNode mergeSort(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 == null ? list2 : list1;
        return head.next;
    }


    private static ListNode getMid(ListNode head) {
        if (head == null || head.next == null){ return head; }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
