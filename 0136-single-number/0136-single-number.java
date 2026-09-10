class Solution {
    public int singleNumber(int[] nums) {
        int xorsum = 0;
        for (int ele : nums) {
            xorsum = xorsum ^ ele;
        }
        return xorsum;
    }
}