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
    public static ListNode reverse(ListNode head) {
        ListNode temp1 = null, temp2 = null, curr = head;
        while (curr != null) {
            temp1 = curr.next;
            curr.next = temp2;
            temp2 = curr;
            curr = temp1;
        }
        return temp2;
    }

    public ListNode doubleIt(ListNode head) {
        if (head.val >= 5) {
            ListNode extra = new ListNode(0);
            extra.next = head;
            head = extra;
        }
        head = reverse(head);
        int carry=0;
        ListNode temp = head;
        while(temp!=null){
            int ele=(temp.val*2)+carry;
            int val = ele%10;
            temp.val=val;
            carry =ele/10;
            temp=temp.next;
        }
        head=reverse(head);
        return head;
    }
}