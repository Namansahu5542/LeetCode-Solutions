class Solution {
    public int longestValidParentheses(String s) {
        int open = 0, close = 0, max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else {
                close++;
            }
            if (open < close) {
                open = 0;
                close = 0;
            } else if(open==close) {
                max = Math.max(max, 2 * close);
            }
        }
        open = 0;
        close = 0;
        //r->l
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
            } else {
                close++;
            }
            if (open > close) {
                open = 0;
                close = 0;
            } else if(open==close){
                max = Math.max(max, 2 * open);
            }
        }
        return max;
    }
}