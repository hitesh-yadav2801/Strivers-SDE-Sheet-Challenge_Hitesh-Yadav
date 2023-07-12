import java.util.* ;
import java.io.*; 
public class Solution {
	static int d1;
	static int d2;
	public static int uniquePaths(int m, int n) {
		d1 = m - 1;
		d2 = n- 1;
		int[][] dp = new int[m][n];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		return path(0, 0, dp);
	}
	public static int path(int s1, int s2, int[][] dp){
		if(s1 > d1 || s2 > d2) return 0;

		if(s1 == d1 && s2 == d2) return 1;

		if(dp[s1][s2] != -1) return dp[s1][s2];

		int path1 = path(s1, s2 + 1, dp);
		int path2 = path(s1 + 1, s2, dp);

		return dp[s1][s2] = path1 + path2;
	}
}
