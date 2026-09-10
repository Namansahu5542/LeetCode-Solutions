
class Solution {
    public static void solve(List<List<Integer>> result, List<Integer> li, int index, int[] nums) {
        if (index == nums.length) {
            
            result.add(new ArrayList<Integer>(li));
            return;

        }
        int num = nums[index];
        li.add(num);
        solve(result, li, index + 1, nums);
        li.remove(li.size()-1);
        solve(result, li, index + 1, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        solve(result, li, 0, nums);
        return result;
    }
}
