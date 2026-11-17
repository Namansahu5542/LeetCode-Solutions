class MyStack {

    Deque<Integer> dq;
    Deque<Integer> temp;

    public MyStack() {
        dq = new ArrayDeque<>();
        temp = new ArrayDeque<>();
    }

    public void push(int x) {

        while (!dq.isEmpty()) {
            temp.addLast(dq.removeFirst());
        }

        dq.addLast(x);

        while (!temp.isEmpty()) {
            dq.addLast(temp.removeFirst());
        }
    }

    public int pop() {
        return dq.isEmpty() ? -1 : dq.removeFirst();
    }

    public int top() {
        return dq.isEmpty() ? -1 : dq.peekFirst();
    }

    public boolean empty() {
        return dq.isEmpty();
    }
}