class BrowserHistory {
    String Homepage;
    Stack<String> st = new Stack<>();
    Stack<String> undo = new Stack<>();

    public BrowserHistory(String homepage) {
        this.Homepage = homepage;
        st.push(Homepage);
    }

    public void visit(String url) {
        st.push(url);
        while (!undo.isEmpty()) {
            undo.pop();
        }
    }

    public String back(int steps) {
        int count = st.size();

        while (steps != 0 && !st.isEmpty()) {
            if (count <= steps) {
                while (count != 1) {
                    undo.push(st.pop());
                    count--;
                }
                return st.peek();
            }
            String Undo = st.pop();
            undo.push(Undo);
            steps--;
            count--;
        }
        return st.peek();
    }

    public String forward(int steps) {
        int count = undo.size();
        while (steps != 0 && !undo.isEmpty()) {

            String redo = undo.pop();
            st.push(redo);
            steps--;
        }
        return st.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */