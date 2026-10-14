class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        String str = "cba";
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            st.push(ch);
            if (ch == 'c') {
                while (!st.isEmpty() && k < str.length()) {
                    char ele = st.pop();
                    if (ele != str.charAt(k)) {
                        return false;
                    }
                    k++;
                }
                k=0;
            }

        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }
}