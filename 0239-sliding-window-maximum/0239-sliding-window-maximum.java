class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int ans[] = new int[nums.length - k + 1];
        int ansindex = 0;
        for (int i = 0; i < k; i++) {
            int ele = nums[i];
            while (!dq.isEmpty() && nums[dq.peekLast()] < ele) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        ans[ansindex] = nums[dq.peekFirst()];
        ansindex++;
        for (int i = k; i < nums.length; i++) {
            int ele = nums[i];
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < ele) {
                dq.pollLast();
            }
            dq.offerLast(i);
            ans[ansindex] = nums[dq.peekFirst()];
            ansindex++;
        }
        return ans;
    }
}