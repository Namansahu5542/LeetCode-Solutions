class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than right, pivot is in right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Pivot is in left half (including mid)
                right = mid;
            }
        }
        return nums[left]; // left == right at the pivot
    }
}
