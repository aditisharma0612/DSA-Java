/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *     }
 * }
 */

class Solution {
    public void deleteNode(ListNode node) {
        // Copy the next node's value to this node
        node.val = node.next.val;

        // Bypass the next node
        node.next = node.next.next;
    }
}
