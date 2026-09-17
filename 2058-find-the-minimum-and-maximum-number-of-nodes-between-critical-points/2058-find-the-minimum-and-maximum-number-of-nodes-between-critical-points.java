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
        int[] MinMax = new int[2];
        MinMax[0] = -1;
        MinMax[1] = -1;
        int pos = 2;
        List<Integer> li = new ArrayList<>();
        ListNode left = head, mid = head.next, right = head.next.next;
        if (right == null) {
            return MinMax;
        }
        while (right != null) {
            if (mid.val < right.val && mid.val < left.val) {
                li.add(pos);
            }
            if (mid.val > left.val && mid.val > right.val) {
                li.add(pos);
            }
            pos++;
            left = mid;
            mid = right;
            right = right.next;
        }
        int l = li.size();
        if (l >= 2) {
            int MinDistance = Integer.MAX_VALUE;
            for (int i = l - 1; i > 0; i--) {
                int min = li.get(i) - li.get(i - 1);
                if (MinDistance > min) {
                    MinDistance = min;
                }

            }
            MinMax[0] = MinDistance;
            MinMax[1] = li.get(l - 1) - li.get(0);
        }
        return MinMax;

    }
}