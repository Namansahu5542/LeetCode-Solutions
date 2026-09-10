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

    public ListNode reverse(ListNode head) {
        ListNode temp1 = null, temp2 = null, curr = head;
        while (curr != null) {
            temp1 = curr.next;
            curr.next = temp2;
            temp2 = curr;
            curr = temp1;
        }
        return temp2;
    }

    public static ListNode mid(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode middle = mid(head);
        ListNode temp = head;
        

        ListNode secondhalf = reverse(middle);

        temp = head;

        while (temp != null && secondhalf != null) {
            if (temp.val != secondhalf.val) {
                return false;
            } else {
                secondhalf = secondhalf.next;
                temp = temp.next;
            }

        }
        return true;
    }
}
