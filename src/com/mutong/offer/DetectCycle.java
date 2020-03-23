package com.mutong.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: 142 唤醒链表
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 说明：不允许修改给定的链表。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：tail connects to node index 1
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: Mutong
 * @Date: 2020-03-22 22:11
 * @time_complexity: O()
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode cur = head;
        while (cur != null){
            if (set.contains(cur)){
                return cur;
            }else {
                set.add(cur);
                cur = cur.next;
            }
        }
        return cur;
    }



    public ListNode detectCycle2(ListNode head) {
        ListNode fast = head,slow = head;
        while (true){
            if (fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

    }

    public ListNode detectCycle3(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode cur = head;
        while (cur != null || cur.next != null){
            if (set.contains(cur)){
                return cur;
            }else{
                set.add(cur);
                cur = cur.next;
            }
        }
        return cur;
    }

    public ListNode detectCycle4(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (true){
            if (fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        fast = head;
        while (slow != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }


}
