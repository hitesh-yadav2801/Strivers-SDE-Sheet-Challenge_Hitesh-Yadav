class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (j1, j2) -> j2.profit - j1.profit);
        int maxDeadline = 0;
        for(int i = 0; i < n; i++){
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }
        int[] ans = new int[maxDeadline + 1];
        Arrays.fill(ans, -1);
        int maxProfit = 0;
        int len = maxDeadline + 1;
        for(int i = 0; i < n; i++){
            int limit = arr[i].deadline;
            while(ans[limit] != -1 && limit > 0){
                limit--;
            }
            if(ans[limit] == -1){
                ans[limit] = arr[i].profit;
            }
        }
        int[] result = new int[2];
        for(int i = 1; i < len; i++){
            //System.out.println(ans[i]);
            if(ans[i] != -1){
                result[0]++;
                result[1] += ans[i];
            }
        }
        return result;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
