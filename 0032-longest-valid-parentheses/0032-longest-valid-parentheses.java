class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int l = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    
                    l = i - st.peek();
                    if (max < l) {
                        max = l;
                    }
                }
            }
        }
        return max;
    }
}