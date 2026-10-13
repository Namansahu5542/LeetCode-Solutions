class Solution {
    
	public static void solve(Stack<Integer> st, List<Integer> li, int i) {
		if (st.isEmpty()) {
			return;
		}
		li.add(st.pop());
		solve(st,li,i);
		st.push(li.remove(i++));
	}
	public static void reverseStack(Stack<Integer> st) {
		// code here
		List<Integer> li = new ArrayList<>();
		
		solve(st, li, 0);
	}
}
