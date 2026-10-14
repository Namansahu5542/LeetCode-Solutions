class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            st.push(ch);
            if (ch == 'c') {
                while (!st.isEmpty() && st.peek() != 'a') {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == 'a') {
                    st.pop();
                }
            }

        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }
}