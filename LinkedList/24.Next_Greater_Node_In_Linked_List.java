/**
 * Problem: Next Greater Node In Linked List (leetcode 1019)
 * Link: https://leetcode.com/problems/next-greater-node-in-linked-list/submissions/1756060095/?envType=problem-list-v2&envId=linked-list
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
    public int[] nextLargerNodes(ListNode head) {
        // Step 1: Convert linked list to ArrayList
        ArrayList<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        int n = values.size();
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        // Step 2: Monotonic stack processing
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && values.get(stack.peek()) < values.get(i)) {
                result[stack.pop()] = values.get(i);
            }
            stack.push(i);
        }

        // Remaining indices in stack already have result[i] = 0 (default)
        return result;
    }



}