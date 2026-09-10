class Solution {
    public static void solve(int[] nums, List<List<Integer>> result, List<Integer> li, int target, int index) {
        if (target == 0) {

            result.add(new ArrayList<>(li));

            return;
        }
        if (target < 0 || index >= nums.length) {
            return;
        }
        li.add(nums[index]);

        solve(nums, result, li, target - nums[index], index + 1);
        while (index < nums.length - 1 && nums[index] == nums[index + 1]) {
            index++;
        }
        li.remove(li.size() - 1);
        solve(nums, result, li, target, index + 1);

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        solve(candidates, result, li, target, 0);

        return result;

    }
}