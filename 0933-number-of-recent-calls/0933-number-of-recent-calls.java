class RecentCounter {
    List<Integer> q;
    int count;

    public RecentCounter() {
        count = 0;
        q = new ArrayList<>();

    }

    public int ping(int t) {
        q.add(t);
        int r1 = t - 3000, r2 = t;
        int prevCount = 0;
        for (int i = 0; i < q.size()-1; i++) {
            int req = q.get(i);
            if (req >= r1 && req <= r2) {
                prevCount++;
            }
        }
        return 1 + prevCount;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */