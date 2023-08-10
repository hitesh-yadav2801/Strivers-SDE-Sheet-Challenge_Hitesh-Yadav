class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, ans, new ArrayList<>(), 0);
        return ans;
    }
    public void solve(int[] nums, List<List<Integer>> ans, List<Integer> temp, int idx){
        if(idx >= nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        solve(nums, ans, temp, idx + 1);
        temp.remove(temp.size() - 1);
        while(idx < nums.length - 1 && nums[idx] == nums[idx + 1]){
            idx++;
        }
        solve(nums, ans, temp, idx + 1);
    }
}
