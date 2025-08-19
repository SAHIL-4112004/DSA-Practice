/**
 * Problem: Remove Duplicate from Sorted List Element(LeetCode 83)
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/1739944128/
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

        ListNode curr = head;
        ListNode prev = curr;

        while(curr != null){
            if(curr.val == prev.val){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}