class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Integer> st = new Stack<>();
        StringBuilder str = new StringBuilder();

        int del = 0;
        for (int i = 0; i < num.length(); i++) {
            int item = num.charAt(i) - '0';
            while (k > 0 && !st.isEmpty() && item < st.peek()) {
                st.pop();
                k--;
            }
            st.push(item);

        }
        while (k > 0) {
            st.pop();
            k--;
        }
        while (!st.isEmpty()) {
            str.append(st.pop() );
        }
        str.reverse();
        while (str.length() > 1 && str.charAt(0) == '0') {
            str.deleteCharAt(0);
        }
        if(str.length() == 0){
            return "0";
        }
        return str.toString();
    }
}