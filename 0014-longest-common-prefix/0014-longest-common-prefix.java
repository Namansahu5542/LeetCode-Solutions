class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        int j = 0;
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 1; i < strs.length; i++) {
            j = 0;
            while (strs[i].indexOf(str)!=0) {
              str=str.substring(0,str.length()-1);
                   if(str.isEmpty()){
                      return "";
                     }
            
            }
        }

        return str;
    }
}