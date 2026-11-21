class Solution {
    public int FindMax(int nums[], int st, int end) {
        int max = Integer.MIN_VALUE, ind = -1;

        for (int i = st; i <= end; i++) {
            if (max < nums[i]) {
                max = nums[i];
                ind = i;
            }
        }
        return ind;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }

        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int ind = FindMax(nums, 0, k - 1);
        dq.offer(ind);
        ans.add(nums[ind]);
        for (int i = k; i < nums.length; i++) {

            if (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.poll();
            }
            if (dq.isEmpty()) {
                int index = FindMax(nums, i - k + 1, i);
                dq.offer(index);
                ans.add(nums[index]);
            } else {
                if (nums[dq.peek()] < nums[i]) {
                    dq.poll();
                    dq.offer(i);
                    ans.add(nums[i]);
                } else {
                    ans.add(nums[dq.peek()]);
                }
            }
        }
        int ar[] = new int[ans.size()];
        for (int j = 0; j < ans.size(); j++) {
            ar[j] = ans.get(j);
        }
        return ar;
    }
}