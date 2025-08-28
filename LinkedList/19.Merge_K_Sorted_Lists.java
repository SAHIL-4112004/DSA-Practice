/**
 * Problem: Merge K Sorted Lists (LeetCode 23)
 * Link: https://leetcode.com/problems/merge-k-sorted-lists/submissions/1751549996/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;

        //min-heap by node value
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) ->a.val-b.val);

        //step1 : add all heads
        for(ListNode node : lists){
            if(node != null) pq.add(node);
        }

        ListNode Dummy = new ListNode(0);
        ListNode curr = Dummy;

        while(!pq.isEmpty()){
            ListNode minValue = pq.poll();
            curr.next = minValue;
            curr = curr.next;

            if(minValue.next!=null){
                pq.add(minValue.next);
            }


        }
        return Dummy.next;
    }
}