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
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size < k) {
            return head;
        }
        ListNode temp1 = null, temp2 = null, curr = head;
        for (int i = 0; i < k; i++) {

            temp1 = head.next;
            head.next = temp2;
            temp2 = head;
            head = temp1;
        }
        ListNode ans = reverseKGroup(temp1, k);
        curr.next = ans;
        return temp2;
    }
}