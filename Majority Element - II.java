// using extra space as HashMap

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);          
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > arr.size() / 3){
                ans.add(key);
            }
        }
        return ans;
    }
}


// Optimal Solution without extra space

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
       int n = arr.size();
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(cnt1 == 0 && ele2 != arr.get(i)){
                cnt1 = 1;
                ele1 = arr.get(i);
            }else if(cnt2 == 0 && ele1 != arr.get(i)){
                cnt2 = 1;
                ele2 = arr.get(i);
            } else if(arr.get(i) == ele1){
                cnt1++;
            } else if(arr.get(i) == ele2){
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if(ele1 == arr.get(i)) cnt1++;
            if(ele2 == arr.get(i)) cnt2++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(cnt1 > n / 3) ans.add(ele1);
        if(cnt2 > n / 3) ans.add(ele2);
        return ans;
    }
}
