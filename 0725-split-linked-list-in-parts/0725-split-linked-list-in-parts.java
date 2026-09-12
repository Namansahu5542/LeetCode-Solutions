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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] Nodes = new ListNode[k];
        ListNode temp = head;
        int size = 0, index = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        ListNode str = null;
        int rem = size % k;
        for (int i = k; i > 0; i--) {

            int quest = size / i;
            int total_nodes = rem>0 ? quest+1 :  quest;
            rem--;
            for (int j = 1; j < total_nodes && temp != null; j++) {
                temp = temp.next;
            }
            if (temp != null) {

                str = temp.next;
                temp.next = null;
            }
            Nodes[index++] = head;
            head = str;
            temp = str;

            size = size - total_nodes;
        }
        return Nodes;
    }
}