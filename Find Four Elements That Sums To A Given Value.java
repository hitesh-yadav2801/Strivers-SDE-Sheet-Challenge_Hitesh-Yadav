import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] nums, int target, int n) {
        Arrays.sort(nums);
        for(int i = 0; i < n - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < n - 2; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = n - 1;
                while(left < right){
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum < target){
                        left++;
                    } else if(sum > target){
                        right--;
                    } else {
                        return "Yes";
                    }
                }
            }
        }
        return "No";
  }
}
