class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = " " + s;
        StringBuilder str = new StringBuilder("");
        
        int k = s.length() - 1;
        for (int i = s.length()-1; i >= 0; i--) {

            if ((s.charAt(k)==' ')) {
                k--;
            } else if (s.charAt(i)==' ') {
                str.append(s.substring(i + 1, k + 1) );
                if(i!=0){
                    str.append(' ');
                }
                k = i - 1;
            }
            

        }
        return str.toString();
    }
}