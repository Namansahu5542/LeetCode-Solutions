class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    count++;
                } else {
                    if (ch == ')') {
                        if (st.peek() != '(') {
                            count++;
                            st.pop();
                        } else {
                            st.pop();
                        }
                    } else if (ch == ']') {
                        if (st.peek() != '[') {
                            count++;
                        } else {
                            st.pop();
                        }
                    } else {
                        if (st.peek() != '{') {
                            count++;
                        } else {
                            st.pop();
                        }
                    }
                }

            }
        }
        if (!st.isEmpty()) {
            count = count + st.size();
        }
        return count;
    }
}