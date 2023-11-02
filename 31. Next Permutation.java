class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for(int i = n - 1; i > 0; i--){
            if(nums[i - 1] < nums[i]){
                idx = i - 1;
                break;
            }
        }
        if(idx != -1){
            for(int i = n - 1; i > idx; i--){
                if(nums[idx] < nums[i]){
                    swap(nums, idx, i);
                    reverse(nums, idx + 1, n - 1);
                    return;
                }
            }
        } else {
            reverse(nums, 0, n - 1);
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
    public void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
