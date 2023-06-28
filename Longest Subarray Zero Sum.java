import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		map.put(0, -1);
		int sum = 0;
		for(int i = 0; i < arr.size(); i++){
			sum += arr.get(i);
			int diff = 0;
			if(map.containsKey(sum)){
				diff = i - map.get(sum);
				ans = Math.max(diff, ans);
			} else {
				map.put(sum, i);
			}
		} 
		return ans;
	}
}
