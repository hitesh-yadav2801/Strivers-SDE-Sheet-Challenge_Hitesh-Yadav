import java.util.* ;
import java.io.*; 

public class Solution {

    static int[] minHeap(int n, int[][] q) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] query = q[i];
            int size = query.length;
            if(size == 2){
                pq.offer(query[1]);
            } else {
                list.add(pq.peek());
                pq.poll();
            }
        }
        int[] ans = new int[list.size()];
        for (int index = 0; index < ans.length; index++) {
            ans[index] = list.get(index);
        }
        return ans;
    }
    
}
