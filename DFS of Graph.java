class Solution {
    ArrayList<Integer> ans;
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        ans = new ArrayList<>();
        dfs(0, adj, new boolean[v]);
        
        return ans;
        
    }
    void dfs(int curNode, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[curNode] = true;
        ans.add(curNode);
        for(int child : adj.get(curNode)){
            if(!vis[child]){
                dfs(child, adj, vis);
            }
        }
    }
}
