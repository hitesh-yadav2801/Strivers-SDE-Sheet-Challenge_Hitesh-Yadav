import java.util.ArrayList;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		int ans = 1;
		for(int i = 1; i < n ; i++){
			if(!arr.get(i).equals(arr.get(i-1))){
				ans++;
			} 
		}
		return ans;
	}
}
