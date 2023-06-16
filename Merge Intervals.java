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
