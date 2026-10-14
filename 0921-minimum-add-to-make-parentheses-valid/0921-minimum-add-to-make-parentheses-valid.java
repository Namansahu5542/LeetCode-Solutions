class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
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

                    }

                }
            }

        }
       
            count = count + st.size();
        
        return count;
    }
}