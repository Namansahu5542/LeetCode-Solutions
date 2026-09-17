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

    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        if (head.val >= 5) {
            head = new ListNode(1,head);
            temp=head.next;
        }
       
        int carry=0;
        while(temp!=null){
            if(temp.next!=null && temp.next.val>4){
                carry=1;
            }
            int ele=(temp.val*2)+carry;
            int val = ele%10;
            temp.val=val;
            carry=0;
            temp=temp.next;
        }

        return head;
    }
}