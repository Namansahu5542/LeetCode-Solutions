class MyStack {
    Deque<Integer> dq;
 Deque<Integer> temp ;
    public MyStack() {
temp=new ArrayDeque<>();
        dq = new ArrayDeque<>();
    }

    public void push(int x) {
       
        while (!dq.isEmpty()) {
            temp.addLast(dq.remove());
        }
        dq.addLast(x);
        while (!temp.isEmpty()) {
            dq.addLast(temp.remove());
        }
    }

    public int pop() {
        if (dq.isEmpty()) {
            return -1;
        }
        return dq.remove();
    }

    public int top() {
        if (dq.isEmpty()) {
            return -1;
        }
        int ans = dq.remove();
        push(ans);
        return dq.peek();
    }

    public boolean empty() {
        if (dq.isEmpty()) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */