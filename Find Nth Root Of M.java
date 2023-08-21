public class Solution {
    public static int NthRoot(int n, int m) {
        int low = 1;
        int high = m;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(Math.pow(mid, n) == m){
                return mid;
            }
            else if(Math.pow(mid, n) < m) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static int multiply(int num, int n){
        long ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans * num;
        }
        return (int)ans;
    }
}
