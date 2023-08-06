class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 0, ans = 0;
        int arrPtr = 0, depPtr = 0;
        
        while(arrPtr < n){
            if(arr[arrPtr] <= dep[depPtr]){
                count++;
                ans = Math.max(ans, count);
                arrPtr++;
            } else {
                count--;
                depPtr++;
            }
        }
        return ans;
    }
    
}
