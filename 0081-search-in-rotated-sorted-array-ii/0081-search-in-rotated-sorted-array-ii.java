class Solution {
    public boolean search(int[] nums, int target) {
        int st = 0, end = nums.length - 1, mid, ans = 0;
        while (st <= end) {
            mid = st + ((end - st) / 2);
            if (nums[mid] == target) {
                return true;
            }
            if (nums[st] == nums[mid] && nums[end] == nums[mid]) {
                st++;
                end--;
            } else if ((nums[st] <= nums[mid])) {
                if (target < nums[mid] && target >= nums[st]) {
                    end = mid - 1;
                } else {

                    st = mid + 1;
                }
            } else if (nums[st] > nums[mid]) {
                if (target > nums[mid] && target <= nums[end]) {
                    st = mid + 1;
                } else {

                    end = mid - 1;
                }
            }

        }
        return false;
    }
}