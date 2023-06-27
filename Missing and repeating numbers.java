import java.util.* ;
import java.io.*;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        Collections.sort(arr);
        for(int i = 0; i < n; i++){
            if(set.contains(arr.get(i))){
                ans[1] = arr.get(i);
            } else {
                set.add(arr.get(i));
            }
        }
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                ans[0] = i;
            }
        }
        return ans;
    }
}
