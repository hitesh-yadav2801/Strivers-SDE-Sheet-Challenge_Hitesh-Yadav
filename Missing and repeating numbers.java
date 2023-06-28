// Using extra space

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


// Mathematical Solution

import java.util.* ;
import java.io.*;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int N) {
        int[] ans = new int[2];
        long n = N;
        // S - Sn
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;
        long S = 0, S2 = 0;

        for(int i = 0; i < n; i++){
            long num = arr.get(i);
            S += num;
            S2 += (long)num * num;
        } 
        long val1 = S - SN;
        long val2 = S2 - S2N;
        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;
        ans[0] = (int)y;
        ans[1] = (int)x;

        return ans;
    }
}
