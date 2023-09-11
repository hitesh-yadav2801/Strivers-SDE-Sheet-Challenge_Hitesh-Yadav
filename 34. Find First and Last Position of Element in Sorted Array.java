class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        int n = nums.length;
        int low = 0, high = n - 1;
        if(nums.length == 1 && nums[0] == target){
            ans[0] = 0; ans[1] = 0;
            return ans;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                ans[0] = mid;
                high = mid - 1;
            } else if(nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0; high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            System.out.println(mid);
            if(nums[mid] == target){
                ans[1] = mid;
                low = mid + 1;
            } else if(nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
