// Using extra space

public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        long[] left = new long[n];
        long[] right = new long[n];
        
        // Calculate the left maximum height for each bar
        long leftMax = 0;
        for (int i = 0; i < n; i++) {
            left[i] = leftMax;
            leftMax = Math.max(leftMax, arr[i]);
        }
        
        // Calculate the right maximum height for each bar
        long rightMax = 0;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }
        
        long trappedWater = 0;
        for (int i = 0; i < n; i++) {
            long minHeight = Math.min(left[i], right[i]);
            if (minHeight > arr[i]) {
                trappedWater += minHeight - arr[i];
            }
        }
        
        return trappedWater;
    }
}

// o(1) space and o(n) time

public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        long leftMax = 0;
        long rightMax = 0;
        long water = 0;
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            if (arr[l] <= arr[r]) {
                if (arr[l] >= leftMax) leftMax = arr[l];
                else water += leftMax - arr[l];
                l++;
            } else {
                if (arr[r] >= rightMax) rightMax = arr[r];
                else water += rightMax - arr[r];
                r--;
            }
        }
        return water;
    }
}

