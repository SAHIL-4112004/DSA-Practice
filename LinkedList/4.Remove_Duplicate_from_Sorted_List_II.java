/**
 * Problem: Remove Duplicate from Sorted List Element II (LeetCode 82)
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/1742057152/
 * Level: Medium
 */

import java.util.*;

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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (head != null) {
            // If current value is duplicate
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with this value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next; // remove the whole duplicate block
            } else {
                prev = prev.next; // move prev forward
            }
            head = head.next; // move head forward
        }

        return dummy.next;
    }
}