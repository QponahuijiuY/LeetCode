package com.mutong.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-06 9:09
 * @time_complexity: O()
 */
public class Clone {
    public RandomListNode Clone(RandomListNode head){
        Map<RandomListNode,RandomListNode> map = new HashMap();
        RandomListNode cur = head;
        while(cur != null){
            map.put(cur, new RandomListNode(cur.label));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
        }
        return map.get(head);
    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}