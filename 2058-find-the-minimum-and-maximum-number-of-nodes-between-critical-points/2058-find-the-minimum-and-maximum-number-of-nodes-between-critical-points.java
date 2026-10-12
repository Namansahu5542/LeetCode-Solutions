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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> li = new ArrayList<>();
        ListNode leftNode = null, RightNode = null, MiddleNode = null;
        if ((head != null && head.next != null) && (head.next.next != null)) {
            leftNode = head;
            MiddleNode = head.next;
            RightNode = head.next.next;
        } else {
            return new int[] { -1, -1 };
        }
        int pos = 2;
        while (RightNode != null) {
            //local minimum
            if ((MiddleNode.val < leftNode.val) && (MiddleNode.val < RightNode.val)) {
                li.add(pos);
            }
            //local maxima
            else if ((MiddleNode.val > leftNode.val) && (MiddleNode.val > RightNode.val)) {
                li.add(pos);
            }

            pos++;
            leftNode = leftNode.next;
            MiddleNode = MiddleNode.next;
            RightNode = RightNode.next;

        }
        int MinMax[] = new int[2];
        int l = li.size();
        if (l > 1) {
            int maxDistance = li.get(l - 1) - li.get(0);
            MinMax[1] = maxDistance;
            //minimum distance
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < l - 1; i++) {
                int minValue = li.get(i + 1) - li.get(i);
                if (minValue < min) {
                    min = minValue;
                }
            }
            MinMax[0] = min;
        } else {
            return new int[] { -1, -1 };
        }

        return MinMax;
    }
}