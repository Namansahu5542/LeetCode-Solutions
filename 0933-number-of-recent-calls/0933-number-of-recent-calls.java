class RecentCounter {
    Deque<Integer> q;
    int count;

    public RecentCounter() {
        count = 0;
        q = new ArrayDeque<>();

    }

    public int ping(int t) {
        q.offer(t);
        int r1 = t - 3000, r2 = t;
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int ele = q.peek();
            if (ele < r1) {
                q.poll();
            } else {
                break;
            }
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */