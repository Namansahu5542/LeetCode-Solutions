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
        List<Integer> li= new ArrayList<>();
        while (temp != null) {
            li.add(temp.val);
            size++;
            temp = temp.next;
        }
        int[] ans = new int[size];
        
        
        Stack<Integer> st = new Stack<>();

        for (int j = 0; j < size; j++) {

            while (!st.isEmpty() && li.get(j) >li.get(st.peek())) {
                int ind = st.pop();
                ans[ind] = li.get(j);
            }
            st.push(j);

        }
        return ans;
    }
}