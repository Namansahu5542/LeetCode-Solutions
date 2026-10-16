class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && c == st.peek()) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        String str = "";
        while (!st.isEmpty()) {
            str =st.pop()  +str ;
        }
        return str;
    }
}