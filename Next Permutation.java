import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		int idx = -1;
		int n = permutation.size();
		for(int i = n - 2; i >= 0; i--){
			if(permutation.get(i) < permutation.get(i+1)){
				idx = i;
				break;
			}
		}
		if(idx == -1){
			Collections.reverse(permutation);
		} else {
			for(int i = n - 1; i > idx; i--){
				if(permutation.get(i) > permutation.get(idx)){
					Collections.swap(permutation, i, idx);
					break;
				}
			}
			reverse(permutation, idx + 1, n - 1);
		}
		return permutation;
	}
	public static void reverse(ArrayList<Integer> permutation, int i, int j){
		while(i < j){
			Collections.swap(permutation, i++, j--);
		}
	}
}
