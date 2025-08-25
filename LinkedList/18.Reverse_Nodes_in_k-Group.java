/**
 * Problem: Reverse Nodes in k-Group (LeetCode 25)
 * Link: https://leetcode.com/problems/reverse-nodes-in-k-group/submissions/1747968957/
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
    public ListNode reverseKGroup(ListNode head, int k) {
        // dummy node before head for clean reconnections
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {
            // find the k-th node from groupPrev
            ListNode kth = getKth(groupPrev, k);
            if (kth == null) break; // not enough nodes left

            ListNode groupStart = groupPrev.next;
            ListNode groupNext = kth.next;

            // reverse [groupStart, groupNext)
            ListNode newHead = reverseSegment(groupStart, groupNext);

            // reconnect
            groupPrev.next = newHead;
            groupStart.next = groupNext;

            // move groupPrev forward
            groupPrev = groupStart;
        }

        return dummy.next;
    }

    // helper to find the k-th node starting from 'node'
    private ListNode getKth(ListNode node, int k) {
        while (node != null && k > 0) {
            node = node.next;
            k--;
        }
        return node;
    }

    // reverse [start, endExclusive) and return new head
    private ListNode reverseSegment(ListNode start, ListNode endExclusive) {
        ListNode prev = endExclusive;
        ListNode curr = start;

        while (curr != endExclusive) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev; // new head of the reversed segment
    }
}
