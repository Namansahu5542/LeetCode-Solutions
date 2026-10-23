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
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int[] ans = new int[size];
        int[] store = new int[size];
        temp = head;
        int i = 0;
        while (temp != null) {
            store[i++] = temp.val;
            temp = temp.next;
        }

        Stack<Integer> st = new Stack<>();

        for (int j = 0; j < size; j++) {

            while (!st.isEmpty() && store[j] >store[st.peek()]) {
                int ind = st.pop();
                ans[ind] = store[j];

            }
            st.push(j);

        }
        return ans;
    }
}