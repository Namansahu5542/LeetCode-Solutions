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
    public static ListNode reverse(ListNode curr, ListNode temp1, ListNode temp2) {
        if (curr == null) {
            return temp2;
        }
        temp1 = curr.next;
        curr.next = temp2;
        temp2 = curr;
        curr = temp1;
        return reverse(curr, temp1, temp2);
    }

    public ListNode reverseList(ListNode head) {

        // ListNode curr = head;
        // ListNode temp1 = null;
        // ListNode temp2 = null;

        // while (curr != null) {
        //     temp1 = curr.next;
        //     curr.next = temp2;
        //     temp2 = curr;
        //     curr = temp1;
        // }

        head = reverse(head, null, null);
        return head;
    }
}