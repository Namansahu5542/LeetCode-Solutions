class MyQueue {
    Deque<Integer> st;
    Deque<Integer> temp;

    public MyQueue() {
        st = new ArrayDeque<>();
        temp = new ArrayDeque<>();
    }

    public void push(int x) {
    
      st.push(x);
    }

    public int pop() {
        if (temp.isEmpty()) {
            while (!st.isEmpty()) {
                temp.push(st.pop());
            }
        }
        return temp.pop();

    }

    public int peek() {
        if (temp.isEmpty()) {
            while (!st.isEmpty()) {
                temp.push(st.pop());
            }
        }
        return temp.peek();
    }

    public boolean empty() {
        return st.isEmpty() && temp.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */