// O(n^2) TC give TLE

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		int n = arr.size();
		int ans = 0;
		for(int i = 0; i < n; i++){
			int num = 0;
			for(int j = i; j < n; j++){
				num ^= arr.get(j);
				if(num == x) ans++;
			}
		}
		return ans;
	}
}


// Optimal solution (O(n) TC & SC)

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		int n = arr.size();
		int ans = 0;
		int xr = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int i = 0; i < n; i++){
			xr ^= arr.get(i);
			int k = xr ^ x;
			if(map.containsKey(k)){
				ans += map.get(k);
			} 
			map.put(xr, map.getOrDefault(xr, 0) + 1);
		}
		return ans;
	}
}
