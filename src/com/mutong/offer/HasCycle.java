package com.mutong.offer;

/**
 * @description:
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
}
