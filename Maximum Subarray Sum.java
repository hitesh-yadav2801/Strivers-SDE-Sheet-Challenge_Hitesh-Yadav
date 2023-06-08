import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] nums, int n) {
		long curMax = nums[0];
        long totalMax = nums[0];
        for(int i =1;i<n;i++){
            curMax = Math.max(nums[i], curMax + nums[i]);
            totalMax = Math.max(totalMax, curMax);
        }
		if(totalMax < 0) return 0;
        return totalMax;
	}

}
