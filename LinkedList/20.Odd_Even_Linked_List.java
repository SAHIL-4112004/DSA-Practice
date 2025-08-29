/**
 * Problem: Odd Even Linked List (LeetCode 328)
 * Link: https://leetcode.com/problems/odd-even-linked-list/submissions/1752694739/?envType=problem-list-v2&envId=linked-list
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
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode newHead = new ListNode();
        ListNode _2ndHead = new ListNode();
        ListNode odd = head;
        ListNode even = odd.next;
        newHead.next = odd;
        _2ndHead.next = even;

        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = _2ndHead.next;
        return newHead.next;

    }
}