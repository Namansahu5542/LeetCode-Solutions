class Solution {
    public static void solve(int index, List<List<Integer>> result, List<Integer> li, int[] nums) {

        if (index == nums.length) {
         
                result.add(new ArrayList<>(li));
            

            return;
        }
        li.add(nums[index]);
        solve(index + 1, result, li, nums);
        li.remove(li.size() - 1);
        while (index+1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }

        solve(index + 1, result, li, nums);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int xorsum = 0;
        solve(0, result, new ArrayList<>(), nums);

        return result;
    }
}