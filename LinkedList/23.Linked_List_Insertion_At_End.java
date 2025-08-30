/**
 * Problem: Linked List Insertion At End (geeksforgeeks)
 * Link: https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1?page=1&category=Linked%20List&sortBy=submissions
 */

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);

        // If the list is empty, return the new node as head
        if (head == null) {
            return newNode;
        }

        Node temp = head;

        // Traverse to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Append the new node
        temp.next = newNode;

        return head;
    }
}