class Solution {
    

    public String removeDuplicates(String s) {
        
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((str.length())!=0  && c == str.charAt(str.length()-1)) {
                str.deleteCharAt(str.length()-1);
            } else {
                str.append(c);
            }
        }
        
        return str.toString();
    }
}