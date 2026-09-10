class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1, j = 1, k = -1;
        int l = nums.length;
       
        for (int i = 0; i < nums.length;) {
            if ((j < l) && (((nums[i]) ^ (nums[j])) != 0)) {

                nums[++k] = nums[i];
                count++;

            }

            i++;
            j = i + 1;

        }

        nums[++k] = nums[l - 1];

        return count;
    }
}