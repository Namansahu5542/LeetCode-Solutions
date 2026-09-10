class Solution {
    // public static boolean solve(int[] nums, int index) {
    //     if (index == nums.length - 1) {
    //         return true;
    //     }
    //     if (index >= nums.length ) {
    //         return false;
    //     }
    //     if(nums[index]==0){
    //         return false;
    //     }
    //     int l = nums[index];

    //     boolean result = false;
    //     for (int i = 1; i <= l; i++) {
    //         boolean res1 = solve(nums, index + i);
    //         result = result || res1;
    //     }

    //     return result;

    // }

    public boolean canJump(int[] nums) {
        // boolean res = solve(nums, 0);
        // return res;

        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; 
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true; 
            }
        }
        return true;
    }
}