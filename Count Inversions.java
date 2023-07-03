// Naive Approach

import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        long count = 0l;
        for(int i = 0; i < n; i++){
            long num = arr[i];
            for(int j = i + 1; j < n; j++){
                if(num > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
