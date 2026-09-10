/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static int count(ListNode str) {
        ListNode curr = str;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }

    public static ListNode Move(ListNode move, int n) {
        while (n != 0) {
            move = move.next;
            n--;
        }
        return move;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int sizeA = count(headA);
        int sizeB = count(headB);

        int size = Math.abs(sizeA - sizeB);

        if (sizeA > sizeB) {
            headA = Move(headA, size);

        } else {
            headB = Move(headB, size);

        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        if (headA == headB) {

            return headA;
        }
        return null;
    }
}