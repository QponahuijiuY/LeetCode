package com.mutong.offer;

import java.util.ArrayList;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-05 14:52
 * @time_complexity: O()
 */
public class MergeKLists {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists == null || lists.size() == 0){return null;}
        return merge(lists,0,lists.size() - 1);
    }
    public ListNode merge(ArrayList<ListNode> lists, int L , int R){
        ArrayList<ListNode> arr = new ArrayList();
        if(L == R) {return arr.get(L);}
        int mid = L + (R - L) / 2;
        ListNode l1 = merge(lists,L,mid);
        ListNode l2 = merge(lists,mid+1,R);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null){return l2;}
        if(l2 == null){return l1;}
        if(l1.val < l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }else {
            l2.next = merge(l1,l2.next);
            return l2;
        }
    }
}
