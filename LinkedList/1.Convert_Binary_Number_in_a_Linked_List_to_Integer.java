/**
 * Problem: Convert Binary Number in a Linked List to a Integer (LeetCode 1290)
 * Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/submissions/1738451946/
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
import java.util.*;

class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append(head.val);
        while(head.next!=null){
            head = head.next;
            sb.append(head.val);
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}