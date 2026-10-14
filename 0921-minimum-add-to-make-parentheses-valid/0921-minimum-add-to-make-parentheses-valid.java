class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0, Opening_Bracket = 0, Closing_Bracket = 0;
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                Opening_Bracket++;
            } else {
                if (Opening_Bracket == 0) {
                    count++;
                }else{
                 
                        Opening_Bracket--;
                    
                }
            }

        }

        count = Opening_Bracket+count;

        return count;
    }
}