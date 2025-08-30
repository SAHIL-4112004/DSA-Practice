/**
 * Problem: Delete Nodes From Linked List Present in Array (LeetCode 3217)
 * Link: https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/submissions/1753857598/
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Step 1: Put nums into a HashSet for quick lookup
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        // Step 2: Create dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 3: Traverse and remove nodes
        ListNode curr = dummy;
        while (curr.next != null) {
            if (set.contains(curr.next.val)) {
                curr.next = curr.next.next;  // skip node
            } else {
                curr = curr.next;           // move forward
            }
        }

        return dummy.next;

    }
}