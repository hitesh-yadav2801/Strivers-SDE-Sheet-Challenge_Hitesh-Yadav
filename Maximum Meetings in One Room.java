
class Solution {
    public static ArrayList<Integer> maxMeetings(int n, int[] start, int[] end) {
       int[][] meet = new int[n][3];
       for(int i = 0; i < n; i++){
           meet[i][0] = start[i];
           meet[i][1] = end[i];
           meet[i][2] = i + 1;
       }
       Arrays.sort(meet, (a,b) -> (a[1] != b[1]) : a[1] - b[1] ? a[2] - b[2]);
       ArrayList<Integer> ans = new ArrayList<>();
       int limit = meet[0][1];
       ans.add(meet[0][2]);
       for(int i = 1; i < n; i++){
           if(meet[i][0] > limit){
               limit = meet[i][1];
               ans.add(meet[i][2]);
           }
       }
       Collections.sort(ans);
       return ans;
    }
}
