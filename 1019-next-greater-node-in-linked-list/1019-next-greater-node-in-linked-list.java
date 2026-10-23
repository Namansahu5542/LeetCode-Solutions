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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp =head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] ans = new int[size];
        temp=head;
        size=0;
        while(head.next!=null){
            temp=head.next;
            while(temp!=null && !(head.val < temp.val) ){
                   temp=temp.next;
                   
            }
            if(temp!=null){
                ans[size] = temp.val;
            }
            size++;
            
            head=head.next;
        }
        return ans;
    }
}