package com.mutong.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: 链表时否有环
 * @Author: Mutong
 * @Date: 2020-03-22 21:19
 * @time_complexity: O()
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head.next;
        ListNode low = head;
        while (low != fast){
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            low = low.next;
        }
        return true;
    }

    public boolean hasCycle2(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode cur = head;
        while (cur != null){
            if (set.contains(cur)){
                return true;
            }else{
                set.add(cur);
                cur = cur.next;
            }
        }
        return false;

    }

    public boolean hasCycle3(ListNode head) {
        ListNode cur = head;
        Set<ListNode> set = new HashSet();
        while(cur != null){
            if(set.contains(cur)){
                return true;
            }else {
                set.add(cur);
            }
            cur = cur.next;
        }
        return false;
    }


    public boolean hasCycle4(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
