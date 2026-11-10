class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int l = nums.length, top = -1;
        boolean found = false;
        int[] st = new int[nums.length];
        int[] ans = new int[l];
        Arrays.fill(ans, -1);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < l) {
                if (nums[i] < nums[j]) {
                    ans[i] = nums[j];
                    found = true;
                    break;
                }
                j++;
            }
            if (!found) {
                j = 0;
                while (j < i) {
                    if (nums[i] < nums[j]) {
                        ans[i] = nums[j];

                        break;
                    }
                    j++;
                }
            }
            found = false;

        }
        return ans;
    }
}