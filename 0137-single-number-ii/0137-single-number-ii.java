class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int ele : nums) {
            mp.put(ele, mp.getOrDefault(ele, 0) + 1);
        }
        for (int keys : nums) {
            if (mp.get(keys) == 1) {
                return keys;
            }
        }
        return -1;
    }
}