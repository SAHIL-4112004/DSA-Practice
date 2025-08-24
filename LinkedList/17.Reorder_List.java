/**
 * Problem: ReOrder List (LeetCode 143)
 * Link: https://leetcode.com/problems/reorder-list/submissions/1746563420/?envType=problem-list-v2&envId=linked-list
 * Approach : 1) Find the mid node
              2) Reverse the second half
              3) merger the two list
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
    public void reorderList(ListNode head) {

        // ListNode Head = head;

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }

        ListNode secondHead = slow.next;
        slow.next = null;

        //reverse
        ListNode curr = secondHead;
        ListNode prev = null;
        while(curr!=null){
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        //merge
        ListNode p1 = head; //first half
        ListNode p2 = prev; //seconf half;
        while(p2!=null){
            // save next pointers
            ListNode n1 = p1.next;
            ListNode n2 = p2.next;

            // connect p1 -> p2
            p1.next = p2;
            // connect p2 -> next of p1
            p2.next = n1;

            p1=n1;
            p2=n2;
        }
    }
}