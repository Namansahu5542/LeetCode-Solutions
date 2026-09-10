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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        int pos = size - n;
        if (pos == 0) {
            head = head.next;
            temp.next = null;
            return head;
        }
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        ListNode del = temp.next;
        temp.next = del.next;
        del.next = null;
        return head;

    }
}