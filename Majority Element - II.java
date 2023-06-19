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
