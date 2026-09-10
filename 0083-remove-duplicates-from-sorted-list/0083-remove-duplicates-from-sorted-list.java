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
        ListNode dupli = head;
        while (dupli != null && dupli.next != null) {
            if ((dupli.val ^ dupli.next.val) == 0) {
                ListNode temp = dupli.next;
                dupli.next = temp.next;
                temp.next = null;
            } else {
                dupli = dupli.next;
            }

        }
        return head;
    }
}