// Better approach NLogN time complexity

import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        int longest = 1, lastSmaller = Integer.MIN_VALUE, curCnt = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) { 
            if(arr[i] - 1 == lastSmaller){ // if there is consecutive sequenece
                curCnt++;
                lastSmaller = arr[i];
                longest = Math.max(longest, curCnt);
            } else if(arr[i] == lastSmaller){  // if previous element is equal to current element
                continue;
            } else { // if there is starting of a new sequence
                lastSmaller = arr[i];
                curCnt = 1;
            }
        }
        return longest;
    }
}


// optimla solution using set

import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        for(int i : arr){
            set.add(i);
        }
        for(int num : set){
            if(!set.contains(num - 1)){
                int curLength = 1;
                while(set.contains(num + 1)){
                    curLength++;
                    num++;
                }
                longest = Math.max(longest, curLength);
            }
        }
        return longest;
    }
}
