package com.mutong.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-28 10:45
 * @time_complexity: O()
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (!stack.isEmpty()){
            arr.add(stack.pop().val);
        }
        return arr;
    }
}
