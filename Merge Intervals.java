import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;



import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        List<Interval> ans = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval.start));
        for(int i = 0; i < n; i++){
            int start = intervals[i].start;
            int end = intervals[i].finish;

            if(!ans.isEmpty() && end <= ans.get(ans.size()- 1).finish){
                continue;
            }
            for(int j = i + 1; j < n; j++){
                if(intervals[j].start <= end){
                    end = Math.max(end, intervals[j].finish);
                } else {
                    break;
                }
            }
            ans.add(new Interval(start, end));
        }
        return ans;
    }
}

// Optimized approach 
// Using stack
class Solution {
    public int[][] merge(int[][] nums) {
        Stack<int[]> st = new Stack<>();
        Arrays.sort(nums, (a,b) -> a[0] - b[0]);
        st.push(nums[0]);

        for(int i = 1; i < nums.length; i++){
            int[] top = st.pop();
            if(top[1] >= nums[i][0]){
                st.push(new int[]{top[0], Math.max(top[1], nums[i][1])});
            } else {
                st.push(top);
                st.push(nums[i]);
            }
        }
        int size = st.size();
        int[][] ans = new int[size][2];
        for(int i = size - 1; i >= 0; i--){
            int[] top = st.pop();
            ans[i][0] = top[0];
            ans[i][1] = top[1];
        }
        return ans;
    }
}


// optimal approach

class Solution {
    public int[][] merge(int[][] nums) {
        int n = nums.length;
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        for(int i = 0; i < n; i++){
            if(ans.isEmpty() || nums[i][0] > ans.get(ans.size() - 1)[1]){
                ans.add(nums[i]);
            } else {
                int[] last = ans.get(ans.size() - 1);
                last[1] = Math.max(last[1], nums[i][1]);
                ans.set(ans.size() - 1, last);
            }
        }
        n = ans.size();
        int[][] result = new int[n][2];
        for(int i = 0; i < n; i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
