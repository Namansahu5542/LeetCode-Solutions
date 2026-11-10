class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ind[] = new int[nums1.length];
        int ans[] = new int[nums1.length];
        int top = -1;
        for (int ele : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (ele == nums2[j]) {
                    ind[++top] = j;
                    ans[top] = -1;
                    break;
                }
            }
        }
        for (int i = top; i >= 0; i--) {
            int num = nums1[i];
            for (int j = ind[i] + 1; j < nums2.length; j++) {
                if (num < nums2[j]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}