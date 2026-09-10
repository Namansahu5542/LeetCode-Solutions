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
  

    public ListNode oddEvenList(ListNode head) {
      
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode Eventemp = head.next, Oddtemp = head, newhead = head.next;
       
        while (Eventemp!=null && Eventemp.next!=null) {  
                Oddtemp.next = Eventemp.next;
                Oddtemp = Oddtemp.next;
           
                
                Eventemp.next = Oddtemp.next;
                Eventemp = Eventemp.next;
           
        }

        
        Oddtemp.next = newhead;
        return head;

    }
}