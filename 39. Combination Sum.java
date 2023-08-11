class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        solve(nums, target, 0, new ArrayList<>(), 0);
        return ans;
    }
    public void solve(int[] nums, int target, int idx, List<Integer> temp, int curSum){
        if(curSum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(idx >= nums.length || curSum > target) return;

        // take
        temp.add(nums[idx]);
        solve(nums, target, idx, temp, curSum + nums[idx]);

        // not take
        temp.remove(temp.size() - 1);
        solve(nums, target, idx + 1, temp, curSum);
    }
}
