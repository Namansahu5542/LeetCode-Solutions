class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] output = new int[temperatures.length];
       Stack<Integer> st = new Stack<>();
       int j=0;
       for(int i=0;i<n;i++){
        while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
            int ans=st.pop();
            output[ans] = i-ans;
            
        }
        st.push(i);
        
       }
       return output;
    }
}