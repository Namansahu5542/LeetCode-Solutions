class Solution {
    public static void solve(int[] nums, List<Integer> li1, List<List<Integer>> li2, int index, int target) {
        if (target == 0) {
            li2.add(new ArrayList<>(li1));
            return;
        }
        if (target < 0 || index>=nums.length) {
            return;
        }
        li1.add(nums[index]);
        solve(nums, li1, li2, index, target - nums[index]);
        li1.remove(li1.size() - 1);
        solve(nums, li1, li2, index + 1, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> li1 = new ArrayList<>();
        List<List<Integer>> li2 = new ArrayList<>();
        solve(candidates, li1, li2, 0, target);
        return li2;
    }
}