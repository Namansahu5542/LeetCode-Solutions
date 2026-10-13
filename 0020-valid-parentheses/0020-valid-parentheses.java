class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ele = s.charAt(i);
            if (ele == '(' || ele == '[' || ele == '{') {
                st.push(ele);
            } else {

                if (ele == ')') {

                    if ((st.isEmpty()) || st.peek() != '(') {
                        return false;
                    }

                } else if (ele == ']') {

                    if ((st.isEmpty()) || st.peek() != '[') {
                        return false;
                    }

                } else {

                    if ((st.isEmpty()) || st.peek() != '{') {
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