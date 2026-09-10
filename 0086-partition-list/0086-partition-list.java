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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode left = new ListNode(-1);
        ListNode lefthead = left;
        ListNode right = new ListNode(-1);
        ListNode righthead = right;
        ListNode temp1 = head;
        while (temp1 != null) {
            if (temp1.val < x) {
                ListNode temp = temp1;
                temp1 = temp1.next;
                temp.next = null;
                left.next = temp;
                left = left.next;
            } else {
                ListNode temp = temp1;
                temp1 = temp1.next;
                temp.next = null;
                right.next = temp;
                right = right.next;
            }
        }
        lefthead = lefthead.next;
        righthead = righthead.next;
        if (lefthead!=null) {
            left.next = righthead;
            right.next = null;
            return lefthead;
        }
        right.next=null;
        return righthead;
    }
}