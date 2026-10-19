class Solution {
    public String simplifyPath(String path) {
       List<String> st = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        String[] str_Array = path.split("/");
        for (int i = 0; i < str_Array.length; i++) {
            String ele = str_Array[i];
          
            if (ele.equals("...")) {
                
                st.add(ele);
            } else if (ele.equals("..")) {
                if (!st.isEmpty()) {
                    st.remove(st.size()-1);
                }
            } else if (!ele.equals("") && !ele.equals(".")) {
                st.add(ele);
            }
        }
        
        int i=0;
        while(i<st.size()){
            str.append("/");
            str.append(st.get(i++));
        }
        if(str.length() == 0){
            str.append("/");
        }

        return str.toString();
    }
}