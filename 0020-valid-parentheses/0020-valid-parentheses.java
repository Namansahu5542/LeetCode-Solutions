class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ele = s.charAt(i);
            if (ele == '(' || ele == '[' || ele == '{') {
                st.push(ele);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (ele == ')') {

                    if (st.peek() != '(') {
                        return false;
                    }

                } else if (ele == ']') {

                    if (st.peek() != '[') {
                        return false;
                    }

                } else {

                    if (st.peek() != '{') {
                        return false;
                    }

                }

                st.pop();

            }
        }
        if (st.isEmpty()) {

            return true;
        }
        return false;
    }
}